package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {


        Map<String, Boolean> isAirportAvailable = new HashMap<>();

        isAirportAvailable.put("London", true);
        isAirportAvailable.put("Cracow", false);
        isAirportAvailable.put("Warsaw", true);
        isAirportAvailable.put("Dubai", true);
        isAirportAvailable.put("Radom", false);
        isAirportAvailable.put("Tokyo", true);
        isAirportAvailable.put("New York", true);

        if (isAirportAvailable.containsKey(flight.getDepartureAirport()) && isAirportAvailable.containsKey(flight.getArrivalAirport())) {
            if (flight.getDepartureAirport().equals(flight.getArrivalAirport())) {
                System.out.println("\nFirst and second airport are on list but are the same --- " + flight.getDepartureAirport());
                return false;
            } else if (isAirportAvailable.get(flight.getDepartureAirport()).equals(true) && isAirportAvailable.get(flight.getArrivalAirport()).equals(true)) {
                System.out.println("\nConnection between " + flight.getDepartureAirport() + " and " + flight.getArrivalAirport() + " is available");
                return true;
            } else {
                System.out.println("\nConnection between " + flight.getDepartureAirport() + " and " + flight.getArrivalAirport() + " isn't available");
                return false;
            }
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Berlin", "London");

        FlightFinder flightFinder = new FlightFinder();

        try {
            if (flightFinder.findFlight(flight)) {
                System.out.println("\nRoute is available");
            } else {
                System.out.println("\nRoute isn't available");
            }

        } catch (RouteNotFoundException e) {
            e.handleRouteException();
            System.out.println("Error - route is not available");
        } finally {
            System.out.println("Flight searching finished!!!");
        }
    }
}
