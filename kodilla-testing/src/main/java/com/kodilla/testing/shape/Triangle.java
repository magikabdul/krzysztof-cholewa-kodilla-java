package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final String shapeName = "triangle";
    private double baseLength;
    private double heightLength;

    public Triangle(double baseLength, double heightLength) {
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }

    public String getShapeName() {
        return null;
    }

    public double getField() {
        return 0;
    }
}
