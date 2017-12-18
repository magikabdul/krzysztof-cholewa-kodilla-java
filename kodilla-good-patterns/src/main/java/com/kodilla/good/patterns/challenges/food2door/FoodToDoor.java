package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;
import java.util.Set;

public class FoodToDoor {
    public final static String PRODUCT_BREAD = "BREAD";
    public final static String PRODUCT_CHICKEN = "CHICKEN";
    public final static String PRODUCT_TOMATO = "TOMATO";
    public final static String PRODUCT_ORANGE = "ORANGE";
    public final static String PRODUCT_CHEESE = "CHEESE";
    public final static String PRODUCT_WHEAT = "WHEAT";

    private Set<Provider> providerList = new HashSet<>();
    private Set<Customer> customerList = new HashSet<>();

    public boolean addProvider(Provider provider) {
        if (provider != null) {
            providerList.add(provider);
            return true;
        } else {
            return false;
        }
    }

    public Set<Provider> getProviderList() {
        return providerList;
    }

    public boolean addProduct(Provider provider, Product product) {
        if (providerList.contains(provider)) {
            provider.addProduct(product);
            return true;
        } else {
            System.out.println("Unregistered provider, please add him first");
            return false;
        }
    }

    public Set<Product> getProductList(Provider provider) {
        if (providerList.contains(provider)) {
            return provider.getProductList();
        } else {
            return null;
        }
    }

    public int getProductQuantity(Provider provider, Product product) {
        if (providerList.contains(provider)) {
            return provider.getProductQuantity(product);
        }
        return 0;
    }

    public Set<Customer> getCustomerList() {
        return customerList;
    }

    public boolean addCustomer(Customer customer) {
        customerList.add(customer);
        return true;
    }

    public boolean orderProduct(Customer customer, Product product, int quantity) {
        System.out.println("Processing order for customer " + customer.getName());

        for (Provider p : providerList) {
            if (p.getProductList().contains(product)) {
                if (p.getProductQuantity(product) >= quantity) {
                    return p.process(product, quantity);
                }
            }
        }
        System.out.println("Processing order - false");
        return false;
    }
}
