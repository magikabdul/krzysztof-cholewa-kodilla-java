package com.kodilla.good.patterns.challenges.food2door;

public class MakeApplicationData {

    public static void build(FoodToDoor foodToDoor) {

        Provider glutenFreeShop = new GlutenFreeShop();
        Provider extraFoodShop = new ExtraFoodShop();
        Provider healthyShop = new HealthyShop();


        foodToDoor.addProvider(glutenFreeShop);
        foodToDoor.addProduct(glutenFreeShop, new Product(FoodToDoor.PRODUCT_CHICKEN));
        foodToDoor.addProduct(glutenFreeShop, new Product(FoodToDoor.PRODUCT_WHEAT));

        foodToDoor.addProvider(extraFoodShop);
        foodToDoor.addProduct(extraFoodShop, new Product(FoodToDoor.PRODUCT_CHEESE));

        foodToDoor.addProvider(healthyShop);
        foodToDoor.addProduct(healthyShop, new Product(FoodToDoor.PRODUCT_ORANGE));
        foodToDoor.addProduct(healthyShop, new Product(FoodToDoor.PRODUCT_TOMATO));
    }
}
