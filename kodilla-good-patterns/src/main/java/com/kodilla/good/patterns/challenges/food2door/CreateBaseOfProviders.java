package com.kodilla.good.patterns.challenges.food2door;

public class CreateBaseOfProviders {

    public ProvidersDataBase createProviders() {

        Company company1 = new Company("ExtraFoodShop");
        Company company2 = new Company("HealthyShop");
        Company company3 = new Company("GlutenFreeShop");

        Product product1 = new Product("Bean", "kg");
        Product product2 = new Product("Apple", "kg");
        Product product3 = new Product("Wheat", "kg");
        Product product4 = new Product("Chicken", "pcs");
        Product product5 = new Product("Cocoa", "kg");

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(company1, product2);
//        ExtraFoodShop foodProvider2 = new ExtraFoodShop(company2, product5);
//        ExtraFoodShop foodProvider3 = new ExtraFoodShop(company3, product4);

        ProvidersDataBase providers = new ProvidersDataBase();
        providers.addProvider(extraFoodShop);
//        providers.addProvider(foodProvider2);
//        providers.addProvider(foodProvider3);

        return providers;
    }
}
