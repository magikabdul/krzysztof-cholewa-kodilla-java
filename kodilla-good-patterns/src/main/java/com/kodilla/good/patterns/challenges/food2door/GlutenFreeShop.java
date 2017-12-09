package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Provider{

    private final String NAME = "GlutenFreeShop";

    private ProviderOrderingService orderingService = new ProviderOrderingService();

    @Override
    public boolean process() {

        orderingService.placeOrder();

        System.out.println("Making order in " + NAME + "\n");
        return true;
    }
}
