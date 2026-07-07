package com.bhavesh.portfolio.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AboutRequest(

        @NotBlank
        String name,

        @NotBlank
        String role,

        @NotBlank
        String college,

        @NotBlank
        String degree,

        @NotBlank
        String location,

        @Email
        @NotBlank
        String email

) {
}