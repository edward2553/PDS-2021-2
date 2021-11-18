package co.com.poli.curses.services;

import co.com.poli.curses.entities.Instructor;
import co.com.poli.curses.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImplementation implements InstructorService {

    @Autowired
    private InstructorRepository repository;

    @Override
    public List<Instructor> findAll() {
        return repository.findAll();
    }

    @Override
    public Instructor create(Instructor instructor) {
        return repository.save(instructor);
    }
}
