package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testCaseOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> list = new ArrayList<>();
        //Then
        Assert.assertEquals(oddNumbersExterminator.exterminate(list), list);
    }

    @Test
    public void testCaseOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> sampleList = new ArrayList<>();
        sampleList.add(1);
        sampleList.add(2);
        sampleList.add(3);
        sampleList.add(4);
        sampleList.add(5);
        //When
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(2);
        resultList.add(4);
        //Then
        Assert.assertEquals(oddNumbersExterminator.exterminate(sampleList), resultList);
    }
}
