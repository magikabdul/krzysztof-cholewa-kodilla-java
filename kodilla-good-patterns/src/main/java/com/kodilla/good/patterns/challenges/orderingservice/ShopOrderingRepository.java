package com.kodilla.good.patterns.challenges.orderingservice;

import java.time.LocalDate;

public class ShopOrderingRepository implements OrderingRepository{

    @Override
    public boolean createOrder(User user, Product product, LocalDate orderDate) {

        System.out.println("Order saved in repository with date " + orderDate +
                            "\nUser: " + user.getLastName() + " " + user.getFirstName() +
                            " bought: " + product.getName());

        return true;
    }
}
