package com.copo12d.example.controllers;

import com.copo12d.example.dto.SchoolDto;
import com.copo12d.example.service.SchoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    //GetMethod
    @GetMapping("/school/all")
    public List<SchoolDto> getSchool() {
        return schoolService.getAllSchools();
    }
    //PostMethod
    @PostMapping("/school")
    public SchoolDto saveSchool(@RequestBody SchoolDto school) {
       return schoolService.saveSchool(school);
    }



}
