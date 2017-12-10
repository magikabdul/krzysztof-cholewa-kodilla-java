package com.kodilla.good.patterns.challenges.flight;

import java.util.LinkedList;
import java.util.List;

public class FlightList {

    List<Flight> flights = new LinkedList<>();

    public boolean addFlight(Flight flight) {

        if (flight != null) {
            flights.add(flight);
            return true;
        } else {
            return false;
        }
    }


}
