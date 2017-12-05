package com.kodilla.good.patterns.challenges.food2door;

public class FoodProvider implements Company {

    private Company company;
    private Product product;

    public FoodProvider(Company company, Product product) {
        this.company = company;
        this.product = product;
    }

    @Override
    public boolean hasProductInOffer(Product product) {
        return false;
    }

    @Override
    public boolean productAvailability(int quantity) {
        return false;
    }

    @Override
    public boolean process() {
        return false;
    }
}
