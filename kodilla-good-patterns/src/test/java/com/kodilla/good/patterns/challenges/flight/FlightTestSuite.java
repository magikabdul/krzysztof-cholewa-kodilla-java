package com.kodilla.good.patterns.challenges.flight;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //Given
        FlightList flightList = new FlightList();
        FlightListMaker.make(flightList);

        //When
        List<Flight> result = FlightFinder.findFlightsFrom(flightList, "Krakow");

        //Then
        Assert.assertEquals(4, result.size());
    }

    @Test
    public void testFindFlightsTo() {
        //Given
        FlightList flightList = new FlightList();
        FlightListMaker.make(flightList);

        //When
        List<Flight> result = FlightFinder.findFlightsTo(flightList, "Krakow");

        //Then
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void testFindFlightThrough() {
        //Given
        FlightList flightList = new FlightList();
        FlightListMaker.make(flightList);

        //When
        List<Flight> result1 = FlightFinder.findFlightsThrough(flightList, "Krakow", "Warszawa");
        List<Flight> result2 = FlightFinder.findFlightsThrough(flightList, "Lodz", "Warszawa");
        List<Flight> result3 = FlightFinder.findFlightsThrough(flightList, "Rzeszow", "Warszawa");

        //Then
        Assert.assertEquals(4, result1.size());
        Assert.assertEquals(2, result2.size());
        Assert.assertEquals(0, result3.size());
    }
}
