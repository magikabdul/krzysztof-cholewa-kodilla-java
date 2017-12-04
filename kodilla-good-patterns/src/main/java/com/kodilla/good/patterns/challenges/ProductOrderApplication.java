package com.kodilla.good.patterns.challenges;

public class ProductOrderApplication {

    public static void main(String[] args) {

        OrderRequestRetriewer orderRequestRetriewer = new OrderRequestRetriewer();
        OrderRequest orderRequest = orderRequestRetriewer.retreive();

        ProductOrderService productOrderService = new ProductOrderService();
        boolean isOrdered = productOrderService.order();

        if (isOrdered) {

        } else {

        }
    }
}
