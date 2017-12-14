package com.kodilla.patterns.strategy.socials;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisherOf = new FacebookPublisher();
    }
}
