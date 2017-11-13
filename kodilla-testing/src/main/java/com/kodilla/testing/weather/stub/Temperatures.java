package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {

    //First element of the map is an identifier of weather station
    //Second element of the map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}
