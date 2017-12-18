package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        Customer customer = new Customer("John Snow", "snow st.");
        FoodToDoor foodToDoor = new FoodToDoor();

        MakeApplicationData.build(foodToDoor);

        ConsoleLogger.showProvidersList(foodToDoor);
        ConsoleLogger.showProvidersProduct(foodToDoor);

        foodToDoor.orderProduct(customer, new Product(FoodToDoor.PRODUCT_CHICKEN), 20);
        foodToDoor.orderProduct(customer, new Product(FoodToDoor.PRODUCT_CHEESE), 10);
        foodToDoor.orderProduct(customer, new Product(FoodToDoor.PRODUCT_ORANGE), 250);

        ConsoleLogger.showProvidersProduct(foodToDoor);
    }
}
