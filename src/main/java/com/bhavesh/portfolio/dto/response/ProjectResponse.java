package com.bhavesh.portfolio.dto.response;

public record ProjectResponse(
        String title,
        String description,
        String technologies,
        String githubLink,
        String liveLink,
        String imageUrl,
        String year
) {
}