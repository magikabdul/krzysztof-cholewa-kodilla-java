package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        context.getBean(Board.class).getToDoList().addTask("New to do task");
        context.getBean(Board.class).getInProgressList().addTask("New in progress task");
        context.getBean(Board.class).getDoneList().addTask("New done task");

        int toDoListSize = context.getBean(Board.class).getToDoList().getTasks().size();
        int inProgressListSize = context.getBean(Board.class).getInProgressList().getTasks().size();
        int doneListSize = context.getBean(Board.class).getDoneList().getTasks().size();

        int indexOfNewTaskToDo = context.getBean(Board.class).getToDoList().getTasks().indexOf("New to do task");
        String resultOfTaskToDo = context.getBean(Board.class).getToDoList().getTasks().get(indexOfNewTaskToDo).toString();

        int indexOfNewTaskInProgress = context.getBean(Board.class).getInProgressList().getTasks().indexOf("New in progress task");
        String resultOfTaskInProgress = context.getBean(Board.class).getInProgressList().getTasks().get(indexOfNewTaskInProgress).toString();

        int indexOfNewTaskDone = context.getBean(Board.class).getDoneList().getTasks().indexOf("New done task");
        String resultOfTaskDone = context.getBean(Board.class).getDoneList().getTasks().get(indexOfNewTaskDone).toString();

        //Then
        Assert.assertEquals(6, toDoListSize);
        Assert.assertEquals("New to do task", resultOfTaskToDo);
        Assert.assertEquals(11, inProgressListSize);
        Assert.assertEquals("New in progress task", resultOfTaskInProgress);
        Assert.assertEquals(3, doneListSize);
        Assert.assertEquals("New done task", resultOfTaskDone);
    }
}
