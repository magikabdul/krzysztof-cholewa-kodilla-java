package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    public final static String ROLL_REGULAR = "REGULAR";
    public final static String ROLL_SEZAME = "SESAME";

    public final static String SAUCE_STANDARD = "STANDARD";
    public final static String SAUCE_1000_ISLAND = "1000_ISLAND";
    public final static String SAUCE_BARBECUE = "BARBECUE";

    public final static String INGREDIENTS_LETTUCE = "LETTUCE";
    public final static String INGREDIENTS_ONION = "ONION";
    public final static String INGREDIENTS_BACON = "BACON";
    public final static String INGREDIENTS_CUCUMBER = "CUCUMBER";
    public final static String INGREDIENTS_CHILI = "CHILI";
    public final static String INGREDIENTS_MUSHROOMS = "MUSHROOMS";
    public final static String INGREDIENTS_SHRIMPS = "SHRIMPS";
    public final static String INGREDIENTS_CHEESE = "CHEESE";

    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients = new ArrayList<>();

    private BigMac(final String roll, final int burgers, final String sauce, final List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;

        for (String ingerdient : ingredients) {
            this.ingredients.add(ingerdient);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            if (roll.equals(BigMac.ROLL_REGULAR) || roll.equals(BigMac.ROLL_SEZAME)) {
                this.roll = roll;
                return this;
            } else {
                throw new IllegalStateException("We have only regular and sesame rolls");
            }
        }

        public BigMacBuilder burgers(int burgers) {
            if (burgers > 0) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("You forgot'bout the most important thing - MEAT");
            }
        }

        public BigMacBuilder sauce(String sauce) {
            if (sauce.equals(BigMac.SAUCE_STANDARD) ||
                    sauce.equals(BigMac.SAUCE_1000_ISLAND) ||
                    sauce.equals(BigMac.SAUCE_BARBECUE)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Available sauces are: standard, 1000 islands and barbecue");
            }
        }

        public BigMacBuilder ingredient(String ingredient) {
            if (ingredient.equals(BigMac.INGREDIENTS_LETTUCE) ||
                    ingredient.equals(BigMac.INGREDIENTS_ONION) ||
                    ingredient.equals(BigMac.INGREDIENTS_BACON) ||
                    ingredient.equals(BigMac.INGREDIENTS_CUCUMBER) ||
                    ingredient.equals(BigMac.INGREDIENTS_CHILI) ||
                    ingredient.equals(BigMac.INGREDIENTS_MUSHROOMS) ||
                    ingredient.equals(BigMac.INGREDIENTS_SHRIMPS) ||
                    ingredient.equals(BigMac.INGREDIENTS_CHEESE)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Ingredient not available");
            }
            return this;
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }
}
