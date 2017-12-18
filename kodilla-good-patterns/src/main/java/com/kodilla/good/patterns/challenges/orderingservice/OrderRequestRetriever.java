package com.kodilla.good.patterns.challenges.orderingservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderRequestRetriever {

    public List<OrderRequest> retrieve() {
        Random r = new Random();

        List<OrderRequest> orderRequests = new ArrayList<>();

        User user1 = new User("Adam", "Smith");
        Product product1 = new Product("Watch", 999);
        LocalDate orderDate1 = LocalDate.now().minusDays(r.nextInt(10));
        orderRequests.add(new OrderRequest(user1, product1, orderDate1));

        User user2 = new User("Tom", "Hanks");
        Product product2 = new Product("Plasma", 1999);
        LocalDate orderDate2 = LocalDate.now().minusDays(r.nextInt(20));
        orderRequests.add(new OrderRequest(user2, product2, orderDate2));

        User user3 = new User("Alice", "Banks");
        Product product3 = new Product("Diamond Ring", 9999);
        LocalDate orderDate3 = LocalDate.now();
        orderRequests.add(new OrderRequest(user3, product3, orderDate3));

        return orderRequests;
    }
}
