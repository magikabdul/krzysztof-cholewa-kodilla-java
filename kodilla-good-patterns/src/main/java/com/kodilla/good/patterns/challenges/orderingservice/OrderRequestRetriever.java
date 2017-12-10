package com.kodilla.good.patterns.challenges.orderingservice;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Adam", "Smith");
        Product product = new Product("Watch", 999);
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(user, product, orderDate);
    }
}
