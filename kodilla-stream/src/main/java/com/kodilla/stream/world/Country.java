package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(String name, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
