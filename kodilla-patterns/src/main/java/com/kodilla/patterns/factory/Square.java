package com.kodilla.patterns.factory;

public final class Square implements Shape{
    private final String name;
    private final double width;

    public Square(String name, double width) {
        this.name = name;
        this.width = width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(width, 2);
    }

    @Override
    public double getCircumference() {
        return 4 * width;
    }
}
