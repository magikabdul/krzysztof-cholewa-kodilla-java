package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProvidersDataBase {

    private Map<Company, Product> companyProductMap = new HashMap<>();

    public boolean addProvider(FoodProvider foodProvider) {

        if (foodProvider instanceof FoodProvider) {
            companyProductMap.put(foodProvider.getCompany(), foodProvider.getProduct());
            return true;
        } else{
            return false;
        }
    }

    public boolean isProviderOnList(Company company) {

        if (companyProductMap.containsKey(company)) {
            return true;
        } else {
            return false;
        }

    }
}
