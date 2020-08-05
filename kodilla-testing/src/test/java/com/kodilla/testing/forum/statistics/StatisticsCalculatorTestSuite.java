package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsCalculatorTestSuite {

    private Statistics statisticsMock;

    private StatisticsCalculator statisticsCalculatorstat = new StatisticsCalculator();

    @Before
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listMock.add("Users");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

    }

    @Test
    public void testZeroPosts() { //gdy liczba postow 0
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCalculatorstat.getPostsQuantity());
        assertEquals(0, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05);
        assertEquals(10, statisticsCalculatorstat.getAverageCommentsPerUser(), 0.05);
        assertEquals(0, statisticsCalculatorstat.getAverageCommentsPerPost(), 0.05);

    }

    @Test
    public void testThousandPosts() {     //gdy liczba postow 1000
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsCalculatorstat.getPostsQuantity());
        assertEquals(100, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05);
        assertEquals(10, statisticsCalculatorstat.getAverageCommentsPerUser(), 0.05);
        assertEquals(0.1, statisticsCalculatorstat.getAverageCommentsPerPost(), 0.05);

    }

    @Test
    public void testZeroComments() {  //gdy 0 komentarzy
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCalculatorstat.getCommentsQuantity());
        assertEquals(5, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05 );
        assertEquals(0, statisticsCalculatorstat.getAverageCommentsPerUser(), 0.05);
        assertEquals(0, statisticsCalculatorstat.getAverageCommentsPerPost(), 0.05);
    }

    @Test
    public void testCommentsLessThanPosts() { //gdy komentarzy mniej niz postow
        //Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20, statisticsCalculatorstat.getPostsQuantity());
        assertEquals(10, statisticsCalculatorstat.getCommentsQuantity());
        assertEquals(2, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05 );
        assertEquals(1, statisticsCalculatorstat.getAverageCommentsPerUser(), 0.05);
        assertEquals(0.5, statisticsCalculatorstat.getAverageCommentsPerPost(), 0.05);
    }

    @Test
    public void testCommentsMoreThanPosts() {  //gdy komentrzy wiecej niz postow
        //Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(2);
        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, statisticsCalculatorstat.getPostsQuantity());
        assertEquals(10, statisticsCalculatorstat.getCommentsQuantity());
        assertEquals(0.2, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05 );
        assertEquals(1, statisticsCalculatorstat.getAverageCommentsPerUser(),0.05);
        assertEquals(5, statisticsCalculatorstat.getAverageCommentsPerPost(), 0.05);
    }

    @Test
    public void testZeroUsers() {//gdy zero uzytkownikow
        //Given
        Statistics statisticsMock2 = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        when(statisticsMock2.usersNames()).thenReturn(listMock);
        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock2);
        //Then
        assertEquals(0, statisticsCalculatorstat.getUsersQuantity());
        assertEquals(0, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05);
        assertEquals(0, statisticsCalculatorstat.getAverageCommentsPerUser(), 0.05);
        assertEquals(0, statisticsCalculatorstat.getAverageCommentsPerPost(), 0.05);
    }

    @Test
    public void testOnehundredUsers() { //gdy 100 uzytkownikow
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listMock.add("Users");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        statisticsCalculatorstat.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statisticsCalculatorstat.getUsersQuantity());
        assertEquals(0.5, statisticsCalculatorstat.getAveragePostsPerUser(), 0.05);
        assertEquals(1, statisticsCalculatorstat.getAverageCommentsPerUser(), 0.05);
        assertEquals(2, statisticsCalculatorstat.getAverageCommentsPerPost(),0.05);
    }
}

