package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
