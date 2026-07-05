package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;

public record ContactRequest(

        @NotBlank(message = "Email is required")
        String email,

        @NotBlank(message = "Phone is required")
        String phone,

        @NotBlank(message = "LinkedIn is required")
        String linkedin,

        @NotBlank(message = "GitHub is required")
        String github,

        @NotBlank(message = "Location is required")
        String location

) {}