package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public final static String SHOPPING = "SHOPPING";
    public final static String PAINTING = "PAINTING";
    public final static String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Food", "Bread", 10);
            case PAINTING:
                return new PaintingTask("Home", "Yellow", "Living Room");
            case DRIVING:
                return new DrivingTask("Trip", "Work", "Car");
            default:
                return null;
        }
    }
}
