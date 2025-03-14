package com.copo12d.example.service;

import com.copo12d.example.dto.SchoolDto;
import com.copo12d.example.repositories.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final schoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, schoolMapper schoolMapper) {
        this.schoolMapper = schoolMapper;
        this.schoolRepository = schoolRepository;
    }
    public List<SchoolDto> getAllSchools() {
        return schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());
    }
    public SchoolDto saveSchool(SchoolDto Dto) {
        schoolRepository.save(schoolMapper.toSchool(Dto));
        return Dto;
    }



}
