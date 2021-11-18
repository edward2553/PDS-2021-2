package co.com.poli.curses.controller;

import co.com.poli.curses.entities.Instructor;
import co.com.poli.curses.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private InstructorService service;

    @GetMapping
    public List<Instructor> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Instructor create(@RequestBody Instructor instructor){
        return service.create(instructor);
    }

}
