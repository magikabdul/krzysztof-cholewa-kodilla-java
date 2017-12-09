package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        FoodToDoor foodToDoor = new FoodToDoor();
        MakeApplicationData.build(foodToDoor);

        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(1), foodToDoor.productList.get(0), 10);
        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(0), foodToDoor.productList.get(0), 10);

        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(1), foodToDoor.productList.get(2), 1);
        foodToDoor.makeCustomerOrder(foodToDoor.customerList.get(0), foodToDoor.productList.get(2), 50);
    }
}
