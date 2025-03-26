package com.copo12d.example.school;

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
