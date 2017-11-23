package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    private Country country1;
    private Country country2;
    private Country country3;
    private Country country4;
    private Country country5;
    private Country country6;
    private Country country7;
    private Country country8;
    private Country country9;

    @Before
    public void before() {
        country1 = new Country("Poland", new BigDecimal("40000000"));
        country2 = new Country("Germany", new BigDecimal("80000000"));
        country3 = new Country("Spain", new BigDecimal("30000000"));

        country4 = new Country("Egypt", new BigDecimal("50000000"));
        country5 = new Country("Morocco", new BigDecimal("20000000"));
        country6 = new Country("Nigeria", new BigDecimal("10000000"));

        country7 = new Country("Japan", new BigDecimal("20000000"));
        country8 = new Country("Iraq", new BigDecimal("70000000"));
        country9 = new Country("China", new BigDecimal("140000000"));
    }

    @Test
    public void testGetPeopleQuantityOnOneContinent() {
        //Given
        Continent europe = new Continent("Europe");

        //When
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);

        BigDecimal europePepoleQuantity = europe.getCountries().stream()
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("150000000");
        Assert.assertEquals(expectedPeopleQuantity, europePepoleQuantity);
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);

        africa.addCountry(country4);
        africa.addCountry(country5);
        africa.addCountry(country6);
        africa.addCountry(country1);

        asia.addCountry(country7);
        asia.addCountry(country8);
        asia.addCountry(country9);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("460000000");
        Assert.assertEquals(expected, result);
    }
}
