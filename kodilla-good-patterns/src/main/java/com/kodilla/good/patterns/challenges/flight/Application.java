package com.kodilla.good.patterns.challenges.flight;

public class Application {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        FlightListMaker.make(flightList);

        FlightFinder.findFlightsFrom(flightList, "Krakow");
        FlightFinder.findFlightsTo(flightList, "Wroclaw");
//        FlightFinder.findFlightsThrough(flightList,"Krakow", "Warszawa", "Gdansk");
//        FlightFinder.findFlightsThrough(flightList,"Poznan", "Warszawa", "Gdansk");
    }
}
