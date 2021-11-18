package co.com.poli.curses.services;

import co.com.poli.curses.entities.Instructor;

import java.util.List;

public interface InstructorService {

    List<Instructor> findAll();
    Instructor create(Instructor instructor);
}
