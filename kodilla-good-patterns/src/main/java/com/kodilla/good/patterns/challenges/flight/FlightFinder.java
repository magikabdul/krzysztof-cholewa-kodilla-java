package com.kodilla.good.patterns.challenges.flight;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public static void findFlightsFrom(FlightList flightList, String airport) {

        System.out.println("Searching flight from: " + airport + "\n");

        flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airport))
                .forEach(System.out::println);

        System.out.println();
    }

    public static void findFlightsTo(FlightList flightList, String airport) {

        System.out.println("Searching flight to: " + airport + "\n");

        flightList.flights.stream()
                .filter(flight -> flight.getAirportOfDestination().equals(airport))
                .forEach(System.out::println);

        System.out.println();
    }

    public static void findFlightsThrough(FlightList flightList, String airportOfStart, String airportOfDestination, String airportOfThrough) {

        List<Flight> list1 = flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airportOfStart))
                .filter(flight -> flight.getAirportOfDestination().equals(airportOfThrough))
                .collect(Collectors.toList());

        List<Flight> list2 = flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airportOfThrough))
                .filter(flight -> flight.getAirportOfDestination().equals(airportOfDestination))
                .collect(Collectors.toList());

        System.out.println("\nList of available flights from " +
                            airportOfStart + " to " +
                            airportOfDestination + " through " +
                            airportOfThrough + "");

        if (list1.size() > 0 && list2.size() > 0) {
            list1.stream().forEach(System.out::print);
            System.out.print("  --- and then ---  ");
            list2.stream().forEach(System.out::println);
        } else {
            System.out.println("Didn't find any matching flights!!");
        }
    }
}
