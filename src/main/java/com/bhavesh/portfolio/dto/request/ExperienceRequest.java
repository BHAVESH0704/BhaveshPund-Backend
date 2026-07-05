package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;

public record ExperienceRequest(

        @NotBlank(message = "Company is required")
        String company,

        @NotBlank(message = "Role is required")
        String role,

        @NotBlank(message = "Duration is required")
        String duration,

        @NotBlank(message = "Description is required")
        String description

) {}