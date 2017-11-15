package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
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
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(50, userQuantity);
        assertEquals(400, comments);
        assertEquals(0, posts);
        assertEquals((double) 0/50, averageValuePostsPerUser, 0);
        assertEquals((double) 400/50, averageValueCommentsPerUser, 0);
        assertEquals(-1, averageValueCommentsPerPost, 0);
    }

    //condition - posts = 1000
    @Test
    public void testCalculateAdvStatisticsPosts1000(){
        //Given
        postsQuantity = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(50, userQuantity);
        assertEquals(400, comments);
        assertEquals(1000, posts);
        assertEquals((double) 1000/50, averageValuePostsPerUser, 0);
        assertEquals((double) 400/50, averageValueCommentsPerUser, 0);
        assertEquals((double) 400/1000, averageValueCommentsPerPost, 0);
    }

    //condition - no comments
    @Test
    public void testCalculateAdvStatisticsNoComments(){
        //Given
        commentsQuantity = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(50, userQuantity);
        assertEquals(0, comments);
        assertEquals(600, posts);
        assertEquals((double) 600/50, averageValuePostsPerUser, 0);
        assertEquals((double) 0/50, averageValueCommentsPerUser, 0);
        assertEquals((double) 0/600, averageValueCommentsPerPost, 0);
    }

    //condition - comments < posts
    @Test
    public void testCalculateAdvStatisticsLessCommentsThenPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(50, userQuantity);
        assertEquals(400, comments);
        assertEquals(600, posts);
        assertEquals((double) 600/50, averageValuePostsPerUser, 0);
        assertEquals((double) 400/50, averageValueCommentsPerUser, 0);
        assertEquals((double) 400/600, averageValueCommentsPerPost, 0);
    }

    //condition - comments > posts
    @Test
    public void testCalculateAdvStatisticsLessPostsThenComments(){
        //Given
        commentsQuantity = 800;
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(50, userQuantity);
        assertEquals(800, comments);
        assertEquals(600, posts);
        assertEquals((double) 600/50, averageValuePostsPerUser, 0);
        assertEquals((double) 800/50, averageValueCommentsPerUser, 0);
        assertEquals((double) 800/600, averageValueCommentsPerPost, 0);
    }

    //condition - no users
    @Test
    public void testCalculateAdvStatisticsNoUsers(){
        //Given
        usersList.clear();
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(0, userQuantity);
        assertEquals(400, comments);
        assertEquals(600, posts);
        assertEquals(-1, averageValuePostsPerUser, 0);
        assertEquals(-1, averageValueCommentsPerUser, 0);
        assertEquals((double) 400/600, averageValueCommentsPerPost, 0);
    }

    //condition - no users
    @Test
    public void testCalculateAdvStatisticsUsers100(){
        //Given
        usersList.addAll(generateUsers(50));
        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        //When
        forumStats.calculateAdvStatistics(statisticsMock);
        double averageValueCommentsPerPost = forumStats.getAverageValueCommentsPerPost();
        double averageValueCommentsPerUser = forumStats.getAverageValueCommentsPerUser();
        double averageValuePostsPerUser = forumStats.getAverageValuePostsPerUser();
        int userQuantity = forumStats.getUsersQuantity();
        int comments = forumStats.getCommentsQuantity();
        int posts = forumStats.getPostsQuantity();

        //Then
        assertEquals(100, userQuantity);
        assertEquals(400, comments);
        assertEquals(600, posts);
        assertEquals((double) 600/100, averageValuePostsPerUser, 0);
        assertEquals((double) 400/100, averageValueCommentsPerUser, 0);
        assertEquals((double) 400/600, averageValueCommentsPerPost, 0);
    }
}
