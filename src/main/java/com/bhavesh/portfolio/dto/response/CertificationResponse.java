package com.bhavesh.portfolio.dto.response;

public record CertificationResponse(
        String title,
        String organization,
        String year,
        String credentialUrl
) {
}