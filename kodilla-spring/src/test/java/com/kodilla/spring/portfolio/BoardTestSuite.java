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
        int toDoListSize = context.getBean(Board.class).getToDoList().getTasks().size();  //getTaskList(Board.TASK_TYPE_TO_DO).getTasks().size();
        int inProgressListSize = context.getBean(Board.class).getInProgressList().getTasks().size();    //getTaskList(Board.TASK_TYPE_IN_PROGRESS).getTasks().size();
        int doneListSize = context.getBean(Board.class).getDoneList().getTasks().size();    //getTaskList(Board.TASK_TYPE_DONE).getTasks().size();

        //Then
        Assert.assertEquals(5, toDoListSize);
        Assert.assertEquals(10, inProgressListSize);
        Assert.assertEquals(2, doneListSize);
    }

    @Test
    public void testReadingEmptyTaskList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When @ Then
        try {
            context.getBean(Board.class).getToDoList().getTasks().size();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
