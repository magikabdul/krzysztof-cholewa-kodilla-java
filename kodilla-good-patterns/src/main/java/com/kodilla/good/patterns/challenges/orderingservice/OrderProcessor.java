package com.kodilla.good.patterns.challenges.orderingservice;

public class OrderProcessor {

    private InformationService informationService;
    private OrderingService orderingService;
    private OrderingRepository orderingRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderingService orderingService,
                          final OrderingRepository orderingRepository) {
        this.informationService = informationService;
        this.orderingService = orderingService;
        this.orderingRepository = orderingRepository;
    }

    public OrderingRepository getOrderingRepository() {
        return orderingRepository;
    }

    public OrderingDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderingService.order(orderRequest.getUser(), orderRequest.getProduct());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderingRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            //return new OrderingDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Order of " + orderRequest.getProduct().getName() + " for Mr/Mrs " + orderRequest.getUser().getLastName() + " can't be finished");
//            return new OrderingDto(orderRequest.getUser(), false);
        }
        return new OrderingDto(orderRequest.getUser(), isOrdered);
    }
}
