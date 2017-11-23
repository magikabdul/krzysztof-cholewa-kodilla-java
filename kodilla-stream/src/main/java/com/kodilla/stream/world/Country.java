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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return name != null ? name.equals(country.name) : country.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
