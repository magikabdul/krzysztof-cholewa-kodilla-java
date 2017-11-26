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

            if(!flight.getDepartureAirport().equals(flight.getArrivalAirport())) {
                for (Map.Entry port1 : isAirportAvailable.entrySet()) {
                    if (port1.getKey().equals(flight.getDepartureAirport())) {
                        if (port1.getValue().equals(true)) {
                            System.out.println("\nFirst airport " + port1.getKey() + " is on list and is available");

                            for (Map.Entry port2 : isAirportAvailable.entrySet()) {
                                if (port2.getKey().equals(flight.getArrivalAirport())) {
                                    if (port2.getValue().equals(true)) {
                                        System.out.println("Second airport " + port2.getKey() + " is on list and is available");
                                        return true;
                                    } else {
                                        System.out.println("Second airport " + port2.getKey() + " is on list but isn't available");
                                        return false;
                                    }
                                }
                            }

                        } else {
                            System.out.println("\nFirst airport " + port1.getKey() + " is on list but isn't available");
                            return false;
                        }
                    }
                }

                return false;
            }   else {
                System.out.println("\nFirst and second airport are on list but are the same --- " + flight.getDepartureAirport());
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
