package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(FlightList flightList, String airport) {

        System.out.println("Searching flight from: " + airport + "\n");

        return flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airport))
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightsTo(FlightList flightList, String airport) {

        System.out.println("Searching flight to: " + airport + "\n");

        return flightList.flights.stream()
                .filter(flight -> flight.getAirportOfDestination().equals(airport))
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightsThrough(FlightList flightList, String airportOfStart, String airportOfDestination) {

        List<Flight> list1 = flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airportOfStart))
                .filter(flight -> !flight.getAirportOfDestination().equals(airportOfDestination))
                .collect(Collectors.toList());

        List<Flight> list2 = flightList.flights.stream()
                .filter(flight -> flight.getAirportOfDestination().equals(airportOfDestination))
                .filter(flight -> !flight.getAirportOfStart().equals(airportOfStart))
                .collect(Collectors.toList());

        List<Flight> list = new ArrayList<>();

        for (Flight flight: list1) {

        }

        list.addAll(list1);
        list.addAll(list2);

//        List<Flight> list = list1.stream()
//                .filter(flight -> flight.getAirportOfDestination().equals(list2.get(0).getAirportOfStart()))
//                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);

        return list;
//        List<Flight> list1 = flightList.flights.stream()
//                .filter(flight -> flight.getAirportOfStart().equals(airportOfStart))
//                .filter(flight -> flight.getAirportOfDestination().equals(airportOfThrough))
//                .collect(Collectors.toList());
//
//        List<Flight> list2 = flightList.flights.stream()
//                .filter(flight -> flight.getAirportOfStart().equals(airportOfThrough))
//                .filter(flight -> flight.getAirportOfDestination().equals(airportOfDestination))
//                .collect(Collectors.toList());
//
//        System.out.println("\nList of available flights from " +
//                            airportOfStart + " to " +
//                            airportOfDestination + " through " +
//                            airportOfThrough + "");
//
//        if (list1.size() > 0 && list2.size() > 0) {
//            list1.stream().forEach(System.out::print);
//            System.out.print("  --- and then ---  ");
//            list2.stream().forEach(System.out::println);
//        } else {
//            System.out.println("Didn't find any matching flights!!");
//        }
    }
}
