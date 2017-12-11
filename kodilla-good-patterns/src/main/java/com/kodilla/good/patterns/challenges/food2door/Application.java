package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        FoodToDoor foodToDoor = new FoodToDoor();

        Provider glutenFreeShop = new GlutenFreeShop();
        foodToDoor.addProvider(glutenFreeShop);
        foodToDoor.addProductForProvider(glutenFreeShop, new Product("Wheat"));
        foodToDoor.addProductForProvider(glutenFreeShop, new Product("Corn Flakes"));
        System.out.println(foodToDoor.getProviderProductList(glutenFreeShop));

//        MakeApplicationData.build(foodToDoor);
//
//        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(1), foodToDoor.productList.get(0), 10);
//        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(0), foodToDoor.productList.get(0), 10);
//
//        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(1), foodToDoor.productList.get(2), 1);
//        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(0), foodToDoor.productList.get(2), 50);
    }
}
