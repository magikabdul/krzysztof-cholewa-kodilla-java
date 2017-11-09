package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        //When
        final List<Integer> onlyOddNumbers = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(onlyOddNumbers, list);
    }

    @Test
    public void testCaseOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List<Integer> sampleList = new ArrayList<>();
        sampleList.add(1);
        sampleList.add(2);
        sampleList.add(3);
        sampleList.add(4);
        sampleList.add(5);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        //When
        final List<Integer> onlyOddNumbers = oddNumbersExterminator.exterminate(sampleList);
        //Then
        Assert.assertEquals(onlyOddNumbers, expectedList);
    }
}
