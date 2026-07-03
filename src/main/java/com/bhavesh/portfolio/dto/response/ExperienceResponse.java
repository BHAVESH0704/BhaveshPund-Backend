package com.bhavesh.portfolio.dto.response;

public record ExperienceResponse(
        String company,
        String role,
        String duration,
        String description
) {
}