package com.kodilla.good.patterns.challenges.orderingservice;

public class OrderingDto {

    private User user;
    private boolean isOrdered;

    public OrderingDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
