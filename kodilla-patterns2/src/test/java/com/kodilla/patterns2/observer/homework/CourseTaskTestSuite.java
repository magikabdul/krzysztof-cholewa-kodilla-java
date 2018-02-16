package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.tasks.HibernateCourseTask;
import com.kodilla.patterns2.observer.homework.tasks.RestApiCourseTask;
import com.kodilla.patterns2.observer.homework.tasks.StreamsCourseTask;
import org.junit.Assert;
import org.junit.Test;

public class CourseTaskTestSuite {

    @Test
    public void testCourseStudentCount() {
        //Given
        CourseStudent student1 = new CourseStudent("Jo Pollack");
        CourseStudent student2 = new CourseStudent("Ann Green");
        CourseStudent student3 = new CourseStudent("Taylor Swift");
        CourseStudent student4 = new CourseStudent("Gregory Bell");

        CourseTask hibernateTask = new HibernateCourseTask();
        CourseTask restApiTask = new RestApiCourseTask();
        CourseTask streamTask = new StreamsCourseTask();

        //When
        hibernateTask.addStudent(student1);
        hibernateTask.addStudent(student2);
        hibernateTask.addStudent(student4);

        restApiTask.addStudent(student4);

        streamTask.addStudent(student3);
        streamTask.addStudent(student2);

        int hibernateTaskListOfStudents = hibernateTask.getStudentList().size();
        int restApiTaskListOfStudents = restApiTask.getStudentList().size();
        int streamTaskListOfStudents = streamTask.getStudentList().size();

        //Then
        Assert.assertEquals(3, hibernateTaskListOfStudents);
        Assert.assertEquals(1, restApiTaskListOfStudents);
        Assert.assertEquals(2, streamTaskListOfStudents);
    }

    @Test
    public void testCourseMentorsCountStudents() {
        //Given
        CourseStudent student1 = new CourseStudent("Jo Pollack");
        CourseStudent student2 = new CourseStudent("Ann Green");
        CourseStudent student3 = new CourseStudent("Taylor Swift");
        CourseStudent student4 = new CourseStudent("Gregory Bell");

        CourseTask hibernateTask = new HibernateCourseTask();
        CourseTask restApiTask = new RestApiCourseTask();
        CourseTask streamTask = new StreamsCourseTask();

        CourseMentor mentor1 = new CourseMentor("Steve Jobs");
        CourseMentor mentor2 = new CourseMentor("Bill Gates");

        //When
        hibernateTask.registerObserver(mentor1);
        hibernateTask.registerObserver(mentor2);
        restApiTask.registerObserver(mentor1);
        streamTask.registerObserver(mentor2);

        hibernateTask.addStudent(student1);
        hibernateTask.addStudent(student2);
        hibernateTask.addStudent(student4);

        restApiTask.addStudent(student4);

        streamTask.addStudent(student3);
        streamTask.addStudent(student2);

        int mentor1CourseTasks = mentor1.getUpdateCount();
        int mentor2CourseTasks = mentor2.getUpdateCount();

        //Then
        Assert.assertEquals(4, mentor1CourseTasks);
        Assert.assertEquals(5, mentor2CourseTasks);
    }
}
