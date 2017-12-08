package com.kodilla.good.patterns.challenges.food2door;

public class MainApplication {

    public static void main(String[] args) {

        CreateBaseOfProviders creator = new CreateBaseOfProviders();
        ProvidersDataBase providers = creator.createProviders();

        System.out.println(providers.getProvidersList());
        System.out.println(providers.getProvider());

    }
}
