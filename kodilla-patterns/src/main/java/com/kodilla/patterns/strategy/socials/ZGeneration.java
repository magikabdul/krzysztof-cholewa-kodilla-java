package com.kodilla.patterns.strategy.socials;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.socialPublisherOf = new SnapchatPublisher();
    }
}
