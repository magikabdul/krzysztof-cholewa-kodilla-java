package com.kodilla.patterns2.observer.homework;

public class CourseMentor implements Observer {
    private final String mentorName;
    private int updateCount = 0;

    public CourseMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void inform(CourseTask courseTask) {
        System.out.println(mentorName + ": new student finished his homework in task: " + courseTask.getTaskName());
        System.out.println("You have " + courseTask.getStudentList().size() + " tasks to verify\n");
        updateCount++;
    }
}
