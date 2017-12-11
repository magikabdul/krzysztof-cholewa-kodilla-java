package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FoodToDoor {


    private List<Provider> providerList = new LinkedList<>();
    private List<Customer> customerList = new LinkedList<>();

    public boolean addProvider(Provider provider) {

        if (provider != null) {
            providerList.add(provider);
            return true;
        } else {
            return false;
        }
    }

    public List<Provider> getProviderList() {
        return providerList;
    }

    public boolean addProductForProvider(Provider provider, Product product) {

        if (provider != null && product != null) {
            //provider.addProduct(product) ? return true : return false;    ---- co jest złego w tym zapisie
            if (provider.addProduct(product)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public Set<Product> getProviderProductList(Provider provider) {

        if (providerList.contains(provider)) {
            return provider.getProductList();
        } else {
            return null;
        }
    }

//
//    public boolean addCustomer(Customer customer) {
//
//        if (customer != null) {
//            customerList.add(customer);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean makeCustomerOrder(Customer customer, Product product, double quantity) {
//
//        System.out.println("Dear Mr/Mrs " + customer.getName() +
//                " your order of " + product +
//                " of " + quantity + " " + product.getUnit() +
//                " is processing...");
//
//        if (product.getQuantity() >= quantity) {
//            product.takeOffTheState(quantity);
//            System.out.println("Order finished, please wait for delivery");
//            System.out.println("Current product quantity: " + product.getQuantity() + "\n\n");
//            return true;
//        } else {
//            System.out.println("Quantity of " + product +
//                    " is under requested. Product will be available within three days");
//            product.buyProduct();
//            return false;
//        }
//    }
}
