package com.bhavesh.portfolio.auth;

import com.bhavesh.portfolio.admin.AdminService;
import com.bhavesh.portfolio.jwt.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AdminService adminService;
    private final JwtService jwtService;

    public AuthService(AdminService adminService,
                       JwtService jwtService) {
        this.adminService = adminService;
        this.jwtService = jwtService;
    }

    public LoginResponse login(LoginRequest request) {

        boolean authenticated = adminService.authenticate(
                request.username(),
                request.password()
        );

        if (!authenticated) {
            return new LoginResponse(null, "Invalid Username or Password");
        }

        String token = jwtService.generateToken(request.username());

        return new LoginResponse(
                token,
                "Login Successful"
        );
    }
}