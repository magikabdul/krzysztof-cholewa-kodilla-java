package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProvidersDataBase {

    private Map<Company, Product> companyProductMap = new HashMap<>();

    public boolean addProvider(ExtraFoodShop extraFoodShop) {

        if (extraFoodShop instanceof ExtraFoodShop) {
            companyProductMap.put(extraFoodShop.getCompany(), extraFoodShop.getProduct());
            return true;
        } else{
            return false;
        }
    }

    public Provider getProvider(Company company) {

        List<Provider> providerList = companyProductMap.entrySet().stream()
                .filter(companyProductEntry -> companyProductEntry.getKey().equals(company))
                .collect()

        if (providerList.size() == 1) {
            return providerList.get(0);
        } else {
            return null;
        }
    }

    public List<Company> getProvidersList() {

        List<Company> companies;

        companies = companyProductMap.entrySet().stream()
                .map(companyProductEntry -> companyProductEntry.getKey())
                .collect(Collectors.toList());

        return companies;
    }
}
