package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Provider {

    private final String NAME = "ExtraFoodShop";

    private ProviderOrderingService orderingService = new ProviderOrderingService();

    @Override
    public boolean process() {

        orderingService.placeOrder();

        System.out.println("Making order in " + NAME + "\n");
        return true;
    }
}
