package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String name;
    private String unit;

    public Product(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }
}
