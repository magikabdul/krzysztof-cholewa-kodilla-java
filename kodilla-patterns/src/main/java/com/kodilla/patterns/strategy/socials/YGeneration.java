package com.kodilla.patterns.strategy.socials;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisherOf = new TwitterPublisher();
    }
}
