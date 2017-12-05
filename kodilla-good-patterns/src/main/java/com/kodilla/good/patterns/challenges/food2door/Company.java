package com.kodilla.good.patterns.challenges.food2door;

public interface Company {

    String name = null;

    boolean hasProductInOffer(Product product);
    boolean productAvailability(int quantity);

    boolean process();
}
