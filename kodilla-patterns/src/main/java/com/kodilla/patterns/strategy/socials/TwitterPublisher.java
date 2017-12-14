package com.kodilla.patterns.strategy.socials;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Tweeter publisher] tweet shared";
    }
}
