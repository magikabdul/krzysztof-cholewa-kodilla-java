package com.kodilla.good.patterns.challenges.food2door;

public interface OrderingService {

    default void placeOrder() {
        System.out.println("\nSending order to Provider");
    }
}
