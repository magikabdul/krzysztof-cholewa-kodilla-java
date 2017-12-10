package com.kodilla.good.patterns.challenges.orderingservice;

import java.time.LocalDate;

public interface OrderingRepository {

    boolean createOrder(User user, Product product, LocalDate orderDate);
}
