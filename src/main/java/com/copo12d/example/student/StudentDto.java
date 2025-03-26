package com.copo12d.example.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty
        String name,
        @NotEmpty
        String lastName,
        String email,
        Integer schoolId
) {
}
