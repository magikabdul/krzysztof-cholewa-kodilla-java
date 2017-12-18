package com.kodilla.good.patterns.challenges.orderingservice;

import java.util.Random;

public class ShopOrderingService implements OrderingService {

    @Override
    public boolean order(User user, Product product) {
        Random r = new Random();

        System.out.println("\nProcessing order of " + product.getName() + " for buyer " +
                            user.getFirstName() + " " + user.getLastName());
        return r.nextBoolean();
    }
}
