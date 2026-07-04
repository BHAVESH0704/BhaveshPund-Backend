package com.bhavesh.portfolio.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/api/v1/admin/test")
    public String test() {
        return "Welcome Admin";
    }
}