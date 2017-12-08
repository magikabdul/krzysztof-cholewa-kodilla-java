package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Provider {

    private OrderingService orderingService;

    private Company company;
    private Product product;
    private String unit;
    private double availableQuantity;

    public ExtraFoodShop(final Company company, final Product product) {
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

        final double MIN_ORDER_QUANTITY = 100;

        if (availableQuantity >= MIN_ORDER_QUANTITY) {
            orderingService.sendOrder(getProduct(), getUnit(), 1000);
            availableQuantity += 1000;
            System.out.println("ordering ....");
            System.out.println("Quantity of " + getProduct() + " : " + getAvailableQuantity() + getUnit());
            return true;
        } else {
            System.out.println("Requested quantity is available on our stock !");
            return false;
        }
    }
}
