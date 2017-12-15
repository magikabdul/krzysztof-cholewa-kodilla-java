package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test

    public void testBigMacBuild() {
        //Given
        BigMac burger = new BigMac.BigMacBuilder()
                .roll(BigMac.ROLL_SEZAME)
                .burgers(3)
                .sauce(BigMac.SAUCE_BARBECUE)
                .ingredient(BigMac.INGREDIENTS_LETTUCE)
                .ingredient(BigMac.INGREDIENTS_BACON)
                .ingredient(BigMac.INGREDIENTS_CHILI)
                .ingredient(BigMac.INGREDIENTS_CUCUMBER)
                .ingredient(BigMac.INGREDIENTS_CHEESE)
                .build();

        System.out.println(burger);

        //When
        String roll = burger.getRoll();
        int quantityOfBurger = burger.getBurgers();
        String sauce = burger.getSauce();
        int result = burger.getIngredients().size();

        //Then
        //Assert.assertEquals(BigMac.ROLL_SEZAME, roll);
        Assert.assertEquals(3, quantityOfBurger);
        Assert.assertEquals(BigMac.SAUCE_BARBECUE, sauce);
        Assert.assertEquals(5, result);
        Assert.assertFalse(burger.getIngredients().contains(BigMac.INGREDIENTS_MUSHROOMS));
    }
}
