package com.copo12d.example.controllers;

import com.copo12d.example.dto.StudentDto;
import com.copo12d.example.dto.StudentResponseDto;
import com.copo12d.example.entities.School;
import com.copo12d.example.entities.Student;
import com.copo12d.example.repositories.StudentRepository;
import com.copo12d.example.service.StudentService;
import com.copo12d.example.service.studentMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    //GET METHODS
    @GetMapping("/students/{id}")
    public StudentResponseDto getStudentsById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    //finding a student by name using a custom method in the StudentRepository interface
    @GetMapping("/students/search/{name}")
    public List<StudentResponseDto> getStudentsByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }

    @GetMapping("/students")
    public List<StudentResponseDto> getStudentsAll() {
        return service.getAllStudents();
    }

    //POST METHODS
    @PostMapping("/student")
    public StudentResponseDto saveStudent(@RequestBody StudentDto dto) {
        return service.saveStudent(dto);
    }

    //DELETE METHODS
    @DeleteMapping("/student/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Integer id) {
        service.deleteStudentById(id);
    }

}
