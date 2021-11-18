package co.com.poli.curses.services;

import co.com.poli.curses.entities.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();
    Course create(Course course);
}
