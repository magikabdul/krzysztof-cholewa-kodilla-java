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
        Board board = context.getBean(Board.class);
        board.addTaskList(Board.TASK_TYPE_TO_DO, context.getBean("createToDoList", TaskList.class));
        board.addTaskList(Board.TASK_TYPE_IN_PROGRESS, context.getBean("createInProgressList", TaskList.class));
        board.addTaskList(Board.TASK_TYPE_DONE, context.getBean("createDoneList", TaskList.class));

        //When
        int toDoListSize = context.getBean(Board.class).getTaskList(Board.TASK_TYPE_TO_DO).getTasks().size();
        int inProgressListSize = context.getBean(Board.class).getTaskList(Board.TASK_TYPE_IN_PROGRESS).getTasks().size();
        int doneListSize = context.getBean(Board.class).getTaskList(Board.TASK_TYPE_DONE).getTasks().size();

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
            context.getBean(Board.class).getTaskList(Board.TASK_TYPE_DONE).getTasks().size();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
