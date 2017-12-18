package com.kodilla.good.patterns.challenges.food2door;

public final class ConsoleLogger {

    public static void showProvidersList(FoodToDoor foodToDoor) {
        System.out.println();
        System.out.println("-------------------- >> Providers list:");
        foodToDoor.getProviderList().stream().forEach(System.out::println);
        System.out.println("-------------------- << End Providers List");
    }

    public static void showProvidersProduct(FoodToDoor foodToDoor) {
        System.out.println();
        for (Provider p : foodToDoor.getProviderList()) {
            System.out.println("List of products of provider: " + p);
            for (Product product : p.getProductList()) {
                System.out.println(" " + product + " , quantity: " + p.getProductQuantity(product));
            }
        }
        System.out.println();
    }
}
