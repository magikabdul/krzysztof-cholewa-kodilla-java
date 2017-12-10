package com.kodilla.good.patterns.challenges.flight;

import java.util.Objects;

public class Flight {

    private String airportOfStart;
    private String airportOfDestination;

    public Flight(String airportOfStart, String airportOfDestination) {
        this.airportOfStart = airportOfStart;
        this.airportOfDestination = airportOfDestination;
    }

    public String getAirportOfStart() {
        return airportOfStart;
    }

    public String getAirportOfDestination() {
        return airportOfDestination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airportOfStart, flight.airportOfStart) &&
                Objects.equals(airportOfDestination, flight.airportOfDestination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airportOfStart, airportOfDestination);
    }

    @Override
    public String toString() {
        return "Flight from " + getAirportOfStart() + " to " + getAirportOfDestination();
    }
}
