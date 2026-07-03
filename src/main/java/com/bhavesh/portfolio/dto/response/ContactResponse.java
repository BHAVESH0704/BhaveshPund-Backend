package com.bhavesh.portfolio.dto.response;

public record ContactResponse(
        String email,
        String phone,
        String linkedin,
        String github,
        String location
) {
}