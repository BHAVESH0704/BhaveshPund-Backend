package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CertificationRequest(

        @NotBlank(message = "Title is required")
        String title,

        @NotBlank(message = "Organization is required")
        String organization,

        @NotBlank(message = "Year is required")
        String year,

        String credentialUrl

) {}