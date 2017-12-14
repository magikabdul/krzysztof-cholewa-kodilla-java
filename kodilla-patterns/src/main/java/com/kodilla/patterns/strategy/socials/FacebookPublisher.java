package com.kodilla.patterns.strategy.socials;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Facebook publisher] post shared";
    }
}
