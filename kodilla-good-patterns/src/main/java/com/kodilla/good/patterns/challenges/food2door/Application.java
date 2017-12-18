package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        Customer customer = new Customer("John Snow", "snow st.");
        FoodToDoor foodToDoor = MakeApplicationData.build();

        ConsoleLogger.showProvidersList(foodToDoor.getProviderList());
        ConsoleLogger.showProvidersProduct(foodToDoor.getProviderList());

        foodToDoor.orderProduct(customer, new Product(MakeApplicationData.PRODUCT_CHICKEN), 20);
        foodToDoor.orderProduct(customer, new Product(MakeApplicationData.PRODUCT_CHEESE), 10);
        foodToDoor.orderProduct(customer, new Product(MakeApplicationData.PRODUCT_ORANGE), 250);

        ConsoleLogger.showProvidersProduct(foodToDoor.getProviderList());
    }
}
