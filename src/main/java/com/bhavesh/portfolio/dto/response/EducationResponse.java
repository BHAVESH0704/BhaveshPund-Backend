package com.bhavesh.portfolio.dto.response;

public record EducationResponse(
        String degree,
        String institute,
        String year,
        String grade
) {
}