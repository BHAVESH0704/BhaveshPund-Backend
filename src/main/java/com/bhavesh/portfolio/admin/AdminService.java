package com.bhavesh.portfolio.admin;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    public AdminService(AdminRepository adminRepository,
                        PasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean authenticate(String username, String password) {

    System.out.println("Login attempt: " + username);

    return adminRepository.findByUsername(username)
            .map(admin -> {

                System.out.println("Admin found: " + admin.getUsername());

                boolean matches = passwordEncoder.matches(password, admin.getPassword());

                System.out.println("Password matches: " + matches);

                return matches;

            })
            .orElseGet(() -> {

                System.out.println("Admin NOT FOUND");

                return false;

            });
}
    }
}