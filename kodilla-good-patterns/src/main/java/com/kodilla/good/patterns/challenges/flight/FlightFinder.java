package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FlightFinder {
    private final FlightList flightList;

    public FlightFinder(FlightList flightList) {
        this.flightList = flightList;
    }

    public List<Flight> findFlightsFrom(String airport) {

        System.out.println("Searching flight from: " + airport + "\n");

        return flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String airport) {

        System.out.println("Searching flight to: " + airport + "\n");

        return flightList.flights.stream()
                .filter(flight -> flight.getAirportOfDestination().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsThrough(String airportOfStart, String airportOfDestination) {

        List<Flight> list1 = flightList.flights.stream()
                .filter(flight -> flight.getAirportOfStart().equals(airportOfStart))
                .filter(flight -> !flight.getAirportOfDestination().equals(airportOfDestination))
                .collect(Collectors.toList());

        List<Flight> list2 = flightList.flights.stream()
                .filter(flight -> flight.getAirportOfDestination().equals(airportOfDestination))
                .filter(flight -> !flight.getAirportOfStart().equals(airportOfStart))
                .collect(Collectors.toList());

        List<Flight> list = new ArrayList<>();

        for (Flight flight1: list1) {
            for (Flight flight2 : list2) {
                if (flight1.getAirportOfDestination().equals(flight2.getAirportOfStart())) {
                    list.add(flight1);
                    list.add(flight2);
                }
            }
        }

        return list;
    }
}
