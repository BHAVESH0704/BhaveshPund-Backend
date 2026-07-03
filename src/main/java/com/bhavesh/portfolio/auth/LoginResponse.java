package com.bhavesh.portfolio.auth;

public record LoginResponse(
        String token,
        String message
) {
}