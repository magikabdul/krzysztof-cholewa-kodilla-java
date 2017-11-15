package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {
    private static int counter = 0;

    private Statistics statisticsMock;
    private List<String> usersList;
    private int postsQuantity = 600;
    private int commentsQuantity = 400;
    private ForumStats forumStats;

    private List<String> generateUsers(int numberOfUsers){
        List<String> names = new ArrayList<>();

        for (int i = 0; i < numberOfUsers; i++){
            names.add("User " + i);
        }

        return names;
    }

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Begin tests for Class - ForumStats\n");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("\nTests are finished");
    }

    @Before
    public void beforeEveryTest(){
        counter++;
        System.out.println("Begin test #" + counter);

        statisticsMock = mock(Statistics.class);
        usersList = new ArrayList<>();
        usersList.addAll(generateUsers(50));

        forumStats = new ForumStats();

    }

    //condition - no posts
    @Test
    public void testCalculateAdvStatisticsNoPosts(){
        //Given
        postsQuantity = 0;
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(0, posts);
    }

    //condition - posts = 1000
    @Test
    public void testCalculateAdvStatisticsPosts1000(){
        //Given
        postsQuantity = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(1000, posts);
    }

    //condition - no comments
    @Test
    public void testCalculateAdvStatisticsNoComments(){
        //Given
        commentsQuantity = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int comments = forumStats.getCommentsQuantity();

        //Then
        assertEquals(0, comments);
    }

    //condition - comments < posts
    @Test
    public void testCalculateAdvStatisticsLessCommentsThenPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double average = forumStats.getCommentsQuantity() / forumStats.getPostsQuantity();

        //Then
        assertEquals(600/400, average, 1);
    }

    //condition - comments > posts
    @Test
    public void testCalculateAdvStatisticsLessPostsThenComments(){
        //Given
        commentsQuantity = 800;
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double average = forumStats.getCommentsQuantity() / forumStats.getPostsQuantity();

        //Then
        assertEquals(600/800, average, 1);
    }

    //condition - no users
    @Test
    public void testCalculateAdvStatisticsNoUsers(){
        //Given
        usersList.clear();
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int usersQuantity = forumStats.getUsersQuantity();

        //Then
        assertEquals(0, usersQuantity);
    }

    //condition - no users
    @Test
    public void testCalculateAdvStatisticsUsers100(){
        //Given
        usersList.addAll(generateUsers(50));
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        int usersQuantity = forumStats.getUsersQuantity();

        //Then
        assertEquals(100, usersQuantity);
    }
}
