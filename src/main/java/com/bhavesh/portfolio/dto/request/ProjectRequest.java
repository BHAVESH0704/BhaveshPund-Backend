package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;

public record ProjectRequest(

        @NotBlank(message = "Title is required")
        String title,

        @NotBlank(message = "Description is required")
        String description,

        @NotBlank(message = "Technologies are required")
        String technologies,

        String githubLink,

        String liveLink,

        String imageUrl,

        @NotBlank(message = "Year is required")
        String year
) {}