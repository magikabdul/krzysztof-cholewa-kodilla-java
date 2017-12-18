package com.kodilla.good.patterns.challenges.orderingservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShopOrderingRepository implements OrderingRepository{
    private List<String> baseOfOrders = new ArrayList<>();

    @Override
    public boolean createOrder(User user, Product product, LocalDate orderDate) {

        baseOfOrders.add("Order saved in repository with date " + orderDate +
                            " User: " + user.getLastName() + " " + user.getFirstName() +
                            " bought: " + product.getName());

        return true;
    }

    @Override
    public void showCurrentBaseOfOrders() {
        baseOfOrders.stream().forEach(System.out::println);
    }
}
