package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String unit;
    private double quantity;

    private List<Provider> providers = new ArrayList<>();

    public Product(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public boolean addProvider(Provider provider) {

        if (provider instanceof Provider && provider != null) {
            providers.add(provider);
            return true;
        } else {
            return false;
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void takeOffTheState(double quantity) {
        this.quantity = this.quantity - quantity;
    }

    public boolean buyProduct() {

        if (providers.get(0).process()) {
            quantity =+ 100;
        }

        System.out.println("Available quantity of " + getName() + " is: " + quantity + "\n\n");

        return true;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    @Override
    public String toString() {
        return name;
    }
}
