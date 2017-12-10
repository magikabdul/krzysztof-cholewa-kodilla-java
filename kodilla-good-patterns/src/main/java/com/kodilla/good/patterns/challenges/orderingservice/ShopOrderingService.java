package com.kodilla.good.patterns.challenges.orderingservice;

public class ShopOrderingService implements OrderingService {

    @Override
    public boolean order(User user, Product product) {

        System.out.println("Processing order of " + product.getName() + " for buyer " +
                            user.getFirstName() + " " + user.getLastName());
        return true;
    }
}
