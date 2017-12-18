package com.kodilla.good.patterns.challenges.orderingservice;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderProcessor orderProcessor = new OrderProcessor(
                new BuyerInformationService(), new ShopOrderingService(), new ShopOrderingRepository());

        orderRequestRetriever.retrieve().stream()
                .forEach(orderProcessor::process);

        System.out.println("\n   >> Current data base entries list: ");
        orderProcessor.getOrderingRepository().showCurrentBaseOfOrders();
    }
}
