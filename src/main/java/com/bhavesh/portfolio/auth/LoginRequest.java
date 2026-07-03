package com.bhavesh.portfolio.auth;

public record LoginRequest(
        String username,
        String password
) {
}