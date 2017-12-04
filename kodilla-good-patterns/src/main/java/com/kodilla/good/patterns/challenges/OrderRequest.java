package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User seller;
    private User buyer;
    private Product product;
    private int productQuantity;
    private LocalDate orderDate;

    public OrderRequest(final User seller, final User buyer,
                        final Product product, final int productQuantity,
                        final LocalDate orderDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
        this.productQuantity = productQuantity;
        this.orderDate = orderDate;
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
