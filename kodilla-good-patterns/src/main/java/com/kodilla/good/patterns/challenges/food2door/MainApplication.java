package com.kodilla.good.patterns.challenges.food2door;

public class MainApplication {

    public static void main(String[] args) {

        Company company = new Company("TheFood");

        FoodProvider foodProvider1 = new FoodProvider(company, new Product("Beans", "kg"));

        ProvidersDataBase providers = new ProvidersDataBase();

        providers.addProvider(foodProvider1);
        System.out.println(providers.isProviderOnList(company));
    }
}
