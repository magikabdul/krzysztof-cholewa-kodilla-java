package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class FoodToDoor {

    List<Product> productList = new LinkedList<>();
    List<Provider> providerList = new LinkedList<>();
    List<Customer> customerList = new LinkedList<>();

    public boolean addProduct(Product product) {

        if (product instanceof Product && product != null) {
            productList.add(product);
            return true;
        } else {
            return false;
        }
    }

    public boolean addProvider(Provider provider) {

        if (provider instanceof Provider && provider != null) {
            providerList.add(provider);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(Customer customer) {

        if (customer instanceof Customer && customer != null) {
            customerList.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean makeCustomerOrder(Customer customer, Product product, double quantity) {

        System.out.println("Dear Mr/Mrs " + customer.getName() +
                " your order of " + product +
                " of " + quantity + " " + product.getUnit() +
                " is processing...");

        if (product.getQuantity() >= quantity) {
            product.takeOffTheState(quantity);
            System.out.println("Order finished, please wait for delivery");
            System.out.println("Current product quantity: " + product.getQuantity() + "\n\n");
            return true;
        } else {
            System.out.println("Quantity of " + product +
                    " is under requested. Product will be available within three days");
            product.buyProduct();
            return false;
        }
    }
}
