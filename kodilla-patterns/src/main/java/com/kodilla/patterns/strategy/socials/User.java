package com.kodilla.patterns.strategy.socials;

public class User {
    private final String name;
    protected SocialPublisher socialPublisherOf;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSocialPublisherOf(SocialPublisher socialPublisherOf) {
        this.socialPublisherOf = socialPublisherOf;
    }
}
