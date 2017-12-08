package com.kodilla.good.patterns.challenges.food2door;

public interface OrderingService {

    boolean sendOrder(Product product, String unit, double quantity);
}