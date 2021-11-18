package co.com.poli.curses.services;

import co.com.poli.curses.entities.Course;
import co.com.poli.curses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{

    @Autowired
    private CourseRepository repository;

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course create(Course course) {
        return repository.save(course);
    }
}
