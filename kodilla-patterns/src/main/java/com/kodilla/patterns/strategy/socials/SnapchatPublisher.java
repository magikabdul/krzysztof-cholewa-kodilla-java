package com.kodilla.patterns.strategy.socials;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Shapchat publisher] snap shared";
    }
}
