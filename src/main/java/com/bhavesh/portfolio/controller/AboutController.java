package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.AboutResponse;
import com.bhavesh.portfolio.service.AboutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/api/v1/about")
    public AboutResponse getAbout() {
        return aboutService.getAbout();
    }
}