package com.copo12d.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    //GET METHODS
    @GetMapping("/students/{id}")
    public Student getStudentsById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    //finding a student by name using a custom method in the StudentRepository interface
    @GetMapping("/students/search/{name}")
    public List<Student> getStudentsByName(@PathVariable String name) {
        return repository.findAllByNameContaining(name);
    }

    @GetMapping("/students")
    public List<Student> getStudentsAll() {
        return repository.findAll();
    }

    //POST METHODS
    @PostMapping("/student")
    public Student PostStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @DeleteMapping("/student/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @PutMapping("/student/update/{id}")

    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return repository.findById(id).orElse(null);
    }

}
