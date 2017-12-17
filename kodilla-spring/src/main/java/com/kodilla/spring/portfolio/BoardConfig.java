package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

//    @Autowired
//    @Qualifier("toDoList")
//    TaskList taskList;

    @Bean
    public Board createBoard() {
        return new Board();
    }


    @Bean//(name = "toDoList")
    //@Scope("prototype")
    public TaskList createToDoList() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add("To do task number " + i);
        }

        return new TaskList(list);
    }

    @Bean//(name = "inProgressList")
    //@Scope("prototype")
    public TaskList createInProgressList() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("In progress task number " + i);
        }

        return new TaskList(list);
    }

    @Bean
    public TaskList createDoneList() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            list.add("Done task number " + i);
        }

        return new TaskList(list);
    }
}
