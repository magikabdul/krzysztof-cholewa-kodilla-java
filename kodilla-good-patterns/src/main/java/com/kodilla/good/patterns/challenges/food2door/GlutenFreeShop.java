package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GlutenFreeShop implements Provider{

    private final String NAME = "GlutenFreeShop";
    private ProviderOrderingService orderingService = new ProviderOrderingService();

    private Map<Product, Double> productMap = new HashMap<>();

    @Override
    public String getProviderName() {
        return NAME;
    }

    @Override
    public boolean addProduct(Product product) {

        if (product != null) {
            if (!productMap.containsKey(product)) {
                productMap.put(product, (double) 0);
                return true;
            } else {
                System.out.println("Provider already has in his offer product " + product);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean removeProduct(Product product) {
        return false;
    }

    @Override
    public Set<Product> getProductList() {
        return productMap.keySet();
    }

    @Override
    public double getProductQuantity(Product product) {
        return 0;
    }



    @Override
    public boolean process() {

        orderingService.placeOrder();

        System.out.println("Making order in " + NAME + "\n");
        return true;
    }
}
