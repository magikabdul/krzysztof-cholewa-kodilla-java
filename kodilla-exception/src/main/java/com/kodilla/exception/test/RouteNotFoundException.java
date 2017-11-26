package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public void handleRouteException() {
        System.out.println("\n" + getClass() + "\n --- Build airport :) ---\n");
    }
}
