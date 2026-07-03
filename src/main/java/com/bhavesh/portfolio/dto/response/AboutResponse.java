package com.bhavesh.portfolio.dto.response;

public record AboutResponse(
        String name,
        String role,
        String college,
        String degree,
        String location,
        String email
) {
}