package com.kodilla.good.patterns.challenges.food2door;

public class FoodProvider implements Provider {

    private CommunicationService communicationService;

    private Company company;
    private Product product;
    private String unit;
    private double availableQuantity;

    public FoodProvider(final Company company, final Product product) {
        this.company = company;
        this.product = product;
    }

    public Company getCompany() {
        return company;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public double getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public boolean process() {
        communicationService.sendOrder(getProduct(), getUnit(), 1000);
        return false;
    }
}
