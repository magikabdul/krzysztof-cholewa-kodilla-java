package com.kodilla.good.patterns.challenges.flight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class FlightTestSuite {
    private FlightListMaker flightList = mock(FlightListMaker.class);
    private FlightList list = new FlightList();

    @Before
    public void before() {
        list.addFlight(new Flight("Krakow", "Warszawa"));
        list.addFlight(new Flight("Gdansk", "Krakow"));
        list.addFlight(new Flight("Lodz", "Warszawa"));
        list.addFlight(new Flight("Warszawa", "Poznan"));
        list.addFlight(new Flight("Krakow", "Lodz"));
        list.addFlight(new Flight("Warszawa", "Gdansk"));
        list.addFlight(new Flight("Krakow", "Rzeszow"));
        list.addFlight(new Flight("Lodz", "Krakow"));
        list.addFlight(new Flight("Krakow", "Gdansk"));
        list.addFlight(new Flight("Gdansk", "Warszawa"));
        list.addFlight(new Flight("Poznan", "Wroclaw"));
        list.addFlight(new Flight("Wroclaw", "Poznan"));
    }

    @Test
    public void testFindFlightFrom() {
        //Given
        when(flightList.make()).thenReturn(list);

        FlightFinder finder = new FlightFinder(flightList.make());

        //When
        List<Flight> result = finder.findFlightsFrom("Krakow");
        result.stream().forEach(System.out::println);

        //Then
        Assert.assertEquals(4, result.size());
    }

    @Test
    public void testFindFlightsTo() {
        //Given
        when(flightList.make()).thenReturn(list);

        FlightFinder finder = new FlightFinder(flightList.make());
//
        //When
        List<Flight> result = finder.findFlightsTo("Krakow");
        result.stream().forEach(System.out::println);

        //Then
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void testFindFlightThrough() {
        //Given
        when(flightList.make()).thenReturn(list);

        FlightFinder finder = new FlightFinder(flightList.make());

        //When
        List<Flight> result1 = finder.findFlightsThrough("Krakow", "Warszawa");
        List<Flight> result2 = finder.findFlightsThrough("Lodz", "Warszawa");
        List<Flight> result3 = finder.findFlightsThrough("Rzeszow", "Warszawa");

        //Then
        Assert.assertEquals(4, result1.size());
        Assert.assertEquals(2, result2.size());
        Assert.assertEquals(0, result3.size());
    }
}
