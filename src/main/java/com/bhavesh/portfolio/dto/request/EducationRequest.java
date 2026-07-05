package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;

public record EducationRequest(

        @NotBlank(message = "Degree is required")
        String degree,

        @NotBlank(message = "Institute is required")
        String institute,

        @NotBlank(message = "Year is required")
        String year,

        @NotBlank(message = "Grade is required")
        String grade

) {}