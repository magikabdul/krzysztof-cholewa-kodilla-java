package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private List<String> tasks;

    public TaskList(List<String> list) {
        tasks = new ArrayList<>();
        tasks.addAll(list);
    }

    public boolean addTask(String task) {
        tasks.add(task);
        return true;
    }

    public List getTasks() {
        return tasks;
    }
}
