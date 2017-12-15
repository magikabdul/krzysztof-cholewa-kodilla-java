package com.kodilla.patterns.factory.task;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactory() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task1 = factory.createTask(TaskFactory.SHOPPING);
        Task task2 = factory.createTask(TaskFactory.PAINTING);
        Task task3 = factory.createTask(TaskFactory.DRIVING);
        Task task4 = factory.createTask("PROGRAMMING");

        //Then
        Assert.assertEquals("Food", task1.getTaskName());
        Assert.assertEquals("Home", task2.getTaskName());
        Assert.assertEquals("Trip", task3.getTaskName());
        Assert.assertNull(task4);
    }

    @Test
    public void testIsTaskExecuted() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task task1 = factory.createTask(TaskFactory.SHOPPING);
        boolean result1 = task1.isTaskExecuted();
        Task task2 = factory.createTask(TaskFactory.DRIVING);
        task2.executeTask();
        boolean result2 = task2.isTaskExecuted();

        //Then
        Assert.assertEquals("Food", task1.getTaskName());
        Assert.assertFalse(result1);
        Assert.assertEquals("Trip", task2.getTaskName());
        Assert.assertTrue(result2);
    }
}
