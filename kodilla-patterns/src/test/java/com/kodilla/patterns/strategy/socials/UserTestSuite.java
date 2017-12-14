package com.kodilla.patterns.strategy.socials;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User tom = new YGeneration("Tom");
        User tim = new ZGeneration("Tim");

        //When
        String post = john.socialPublisherOf.share();
        String tweet = tom.socialPublisherOf.share();
        String snap = tim.socialPublisherOf.share();

        //Then
        Assert.assertEquals("[Facebook publisher] post shared", post);
        Assert.assertEquals("[Tweeter publisher] tweet shared", tweet);
        Assert.assertEquals("[Snapchat publisher] snap shared", snap);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");

        //When
        String post = john.socialPublisherOf.share();
        System.out.println(post);
        john.setSocialPublisherOf(new TwitterPublisher());
        post = john.socialPublisherOf.share();
        System.out.println(post);

        //Then
        Assert.assertEquals("[Tweeter publisher] tweet shared", post);
    }
}
