package com.kodilla.good.patterns.challenges.orderingservice;

public class BuyerInformationService implements InformationService {

    @Override
    public boolean inform(User user) {
        System.out.println("Message for user " + user.getLastName() + " has been send.");
        return true;
    }
}
