package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProvidersDataBase {

    private Map<Company, Product> companyProductMap = new HashMap<>();

    public boolean addCompany(Company company) {
        if (company instanceof Company && company != null) {
            companyProductMap.put(company, null);
            return true;
        } else {
            return false;
        }
    }
}
