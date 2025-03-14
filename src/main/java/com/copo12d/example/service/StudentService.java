package com.copo12d.example.service;

import com.copo12d.example.dto.StudentDto;
import com.copo12d.example.dto.StudentResponseDto;
import com.copo12d.example.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository repository;
    private final studentMapper mapper;

    public StudentService(StudentRepository repository, studentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public StudentResponseDto saveStudent(StudentDto dto) {
        var student = mapper.toStudent(dto);
        var savedStudent = repository.save(student);
        return mapper.toStudentResponseDto(savedStudent);
    }

    public List<StudentResponseDto> getAllStudents() {
        return repository.findAll()
                .stream()
                .map(mapper::toStudentResponseDto)
                .collect(Collectors.toList());
    }

    public StudentResponseDto getStudentById(@PathVariable Integer id) {
        return repository.findById(id).map(mapper::toStudentResponseDto).orElse(null);
    }

    public List<StudentResponseDto> getStudentByName(@PathVariable String name) {
        return repository.findAllByNameContaining(name).stream()
                .map(mapper::toStudentResponseDto)
                .collect(Collectors.toList());
    }

    public void deleteStudentById(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
