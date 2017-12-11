package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

public interface Provider {

    String getProviderName();

    boolean addProduct(Product product);
    boolean removeProduct(Product product);

    Set<Product> getProductList();

    double getProductQuantity(Product product);

    boolean process();
}
