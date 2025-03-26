package com.copo12d.example.school;

import org.springframework.stereotype.Service;

@Service
public class schoolMapper {
    //Dto methods

    //post
    public School toSchool(SchoolDto schoolDto) {
        return new School(schoolDto.name());
    }
    //get
    public SchoolDto toSchoolDto(School school) {
        return new SchoolDto(school.getName());
    }
}
