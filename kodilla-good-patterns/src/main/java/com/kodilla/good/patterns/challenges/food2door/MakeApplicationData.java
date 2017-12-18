package com.kodilla.good.patterns.challenges.food2door;

public class MakeApplicationData {
    public final static String PRODUCT_BREAD = "BREAD";
    public final static String PRODUCT_CHICKEN = "CHICKEN";
    public final static String PRODUCT_TOMATO = "TOMATO";
    public final static String PRODUCT_ORANGE = "ORANGE";
    public final static String PRODUCT_CHEESE = "CHEESE";
    public final static String PRODUCT_WHEAT = "WHEAT";


    public static FoodToDoor build() {
        FoodToDoor foodToDoor = new FoodToDoor();

        Provider glutenFreeShop = new GlutenFreeShop();
        Provider extraFoodShop = new ExtraFoodShop();
        Provider healthyShop = new HealthyShop();

        foodToDoor.addProvider(glutenFreeShop);
        foodToDoor.addProduct(glutenFreeShop, new Product(PRODUCT_CHICKEN));
        foodToDoor.addProduct(glutenFreeShop, new Product(PRODUCT_WHEAT));

        foodToDoor.addProvider(extraFoodShop);
        foodToDoor.addProduct(extraFoodShop, new Product(PRODUCT_CHEESE));

        foodToDoor.addProvider(healthyShop);
        foodToDoor.addProduct(healthyShop, new Product(PRODUCT_ORANGE));
        foodToDoor.addProduct(healthyShop, new Product(PRODUCT_TOMATO));

        return foodToDoor;
    }
}
