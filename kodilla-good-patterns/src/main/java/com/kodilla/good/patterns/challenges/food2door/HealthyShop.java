package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HealthyShop  implements Provider{

    private final String NAME = "Healthy Shop";

    private ProviderOrderingService orderingService = new ProviderOrderingService();

    private Map<Product, Integer> productMap = new HashMap<>();

    @Override
    public String getProviderName() {
        return NAME;
    }

    @Override
    public boolean addProduct(Product product) {
        Random r = new Random();

        if (product != null) {
            if (!productMap.containsKey(product)) {
                productMap.put(product, r.nextInt(500));
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
    public int getProductQuantity(Product product) {
        return productMap.get(product);
//        for (Map.Entry<Product, Integer> p : productMap.entrySet()) {
//            if (p.getKey().equals(product)) {
//                return p.getValue();
//            }
//        }
//        return 0;
    }



    @Override
    public boolean process(Product product, int quantity) {

        orderingService.placeOrder();

        System.out.println("Making order in " + NAME + " of " + product + "\n");

        productMap.put(product, productMap.get(product) - quantity);

//        for (Map.Entry<Product, Integer> storage : productMap.entrySet()) {
//            if (storage.getKey().equals(product)) {
//                storage.setValue(storage.getValue() - quantity);
//            }
//        }

        return true;
    }

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HealthyShop that = (HealthyShop) o;

        return NAME.equals(that.NAME);
    }

    @Override
    public int hashCode() {
        return NAME.hashCode();
    }
}
