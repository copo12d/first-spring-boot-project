package com.copo12d.example.controllers;

import com.copo12d.example.entities.School;
import com.copo12d.example.repositories.SchoolRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
    //GetMethod
    @GetMapping("/school/all")
    public List<School> getSchool() {
        return schoolRepository.findAll();
    }

    //PostMethod
    @PostMapping("/school")
    public School saveSchool(@RequestBody School school) {
        return schoolRepository.save(school);
    }
}
