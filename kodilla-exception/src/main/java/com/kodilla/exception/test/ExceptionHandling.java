package com.kodilla.exception.test;

import java.util.Random;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        Random r = new Random();
        double x = r.nextDouble() * 2;
        double y = r.nextDouble() * 2;

        try {
            secondChallenge.probablyIWillThrowException(x, y);
            System.out.println("There was no exception");
        } catch (Exception e) {
            System.out.println("Bad luck - we have an exception");
        } finally {

            System.out.println("x: " + x + ", y: " + y);
            System.out.println("Exception handling finished");
        }
    }
}
