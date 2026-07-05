package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;

public record SkillRequest(

        @NotBlank(message = "Skill name is required")
        String name,

        @NotBlank(message = "Category is required")
        String category

) {}