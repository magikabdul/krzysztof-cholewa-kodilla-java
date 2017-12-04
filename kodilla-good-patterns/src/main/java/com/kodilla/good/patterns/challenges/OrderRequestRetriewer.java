package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriewer {

    public OrderRequest retreive() {
        User seller = new User("John", "Smith");
        User buyer = new User("Ann", "Bone");
        Product product = new Product("Camera", 1299);
        int productQuantity = 1;
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(seller, buyer, product, productQuantity, orderDate);
    }
}
