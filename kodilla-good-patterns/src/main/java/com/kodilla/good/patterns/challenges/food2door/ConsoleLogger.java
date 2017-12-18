package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

public final class ConsoleLogger {

    public static void showProvidersList(Set<Provider> providers) {
        System.out.println();
        System.out.println("-------------------- >> Providers list:");
        providers.forEach(System.out::println);
        System.out.println("-------------------- << End Providers List");
    }

    public static void showProvidersProduct(Set<Provider> providers) {
        System.out.println();
        for (Provider p : providers) {
            System.out.println("List of products of provider: " + p);
            for (Product product : p.getProductList()) {
                System.out.println(" " + product + " , quantity: " + p.getProductQuantity(product));
            }
        }
        System.out.println();
    }
}
