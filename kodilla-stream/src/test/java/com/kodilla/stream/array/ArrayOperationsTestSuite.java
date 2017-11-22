package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        Random r = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }

        //When
        double expected = 0;
        for (int i = 0; i < array.length; i++) {
            expected = expected + array[i];
        }
        expected = expected / array.length;
        for (Integer i : array) {
            System.out.print(i + ",");
        }

        System.out.println(" and average value is: " + expected + "\n");

        double result = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(expected, result, 0);
    }
}
