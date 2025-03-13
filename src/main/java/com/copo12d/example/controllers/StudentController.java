package com.copo12d.example.controllers;

import com.copo12d.example.dto.StudentDto;
import com.copo12d.example.dto.StudentResponseDto;
import com.copo12d.example.entities.School;
import com.copo12d.example.entities.Student;
import com.copo12d.example.repositories.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
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
    public StudentResponseDto PostStudent(@RequestBody StudentDto dto) {
        return toStudentResponseDto(repository.save(toStudent(dto)));
    }
    
    private Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setName(dto.name());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);
        return student;
    }
    private StudentResponseDto toStudentResponseDto(Student student) {
        return new StudentResponseDto(student.getName(),student.getLastName(),student.getEmail());
    }
    //DELETE METHODS
    @DeleteMapping("/student/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Integer id) {
        repository.deleteById(id);
    }
    //UPDATE METHODS
    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return repository.findById(id).orElse(null);
    }

}
