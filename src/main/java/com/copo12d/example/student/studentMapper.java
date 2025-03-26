package com.copo12d.example.student;

import com.copo12d.example.school.School;
import org.springframework.stereotype.Service;

@Service
public class studentMapper {
    //Dto methods

    //post
    public Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setName(dto.name());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);
        return student;
    }
    //get
    public StudentResponseDto toStudentResponseDto(Student student) {
        return new StudentResponseDto(student.getName(),student.getLastName(),student.getEmail());
    }
}
