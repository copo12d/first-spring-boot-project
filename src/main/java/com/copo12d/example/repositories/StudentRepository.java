package com.copo12d.example.repositories;

import com.copo12d.example.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByNameContaining(String name);
}
