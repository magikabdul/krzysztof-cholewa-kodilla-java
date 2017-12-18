package com.kodilla.good.patterns.challenges.food2door;

public interface OrderingService {

    default void placeOrder() {
        System.out.println("Sending order to Provider");
    }
}
