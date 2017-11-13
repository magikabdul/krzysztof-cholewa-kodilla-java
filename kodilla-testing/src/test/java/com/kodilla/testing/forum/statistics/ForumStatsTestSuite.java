package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {
    private static int counter = 0;

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
    }

    //condition - no users
    @Test
    public void testCalculateAdvStatisticsNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(usersList);

        ForumStats forumStats = new ForumStats();

        //When
        int usersQuantity = forumStats.getUsersQuantity(statisticsMock);

        //Then
        Assert.assertEquals(0, usersQuantity);
    }
}
