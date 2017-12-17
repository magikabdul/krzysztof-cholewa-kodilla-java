package com.kodilla.spring.portfolio;

public class Board {
    public final static String TASK_TYPE_TO_DO = "TO DO";
    public final static String TASK_TYPE_IN_PROGRESS = "IN PROGRESS";
    public final static String TASK_TYPE_DONE = "DONE";

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

//    public Board() {
//        toDoList = new ArrayList<>();
//        inProgressList = new ArrayList<>();
//        doneList = new ArrayList<>();
//    }

    public boolean addTaskList(String taskType, TaskList taskList) {
        if (taskList.getTasks().size() > 0) {
            switch (taskType) {
                case TASK_TYPE_TO_DO: {
                    toDoList = taskList;
                    return true;
                }
                case TASK_TYPE_IN_PROGRESS: {
                    inProgressList = taskList;
                    return true;
                }
                case TASK_TYPE_DONE: {
                    doneList = taskList;
                    return true;
                }
                default: {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public TaskList getTaskList(String taskType) {
        switch (taskType) {
            case TASK_TYPE_TO_DO: {
                return toDoList;
            }
            case TASK_TYPE_IN_PROGRESS: {
                return inProgressList;
            }
            case TASK_TYPE_DONE: {
                return doneList;
            }
            default: {
                return null;
            }
        }
    }
}
