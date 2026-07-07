package com.bhavesh.portfolio.controller.admin;

import com.bhavesh.portfolio.dto.request.AboutRequest;
import com.bhavesh.portfolio.entity.About;
import com.bhavesh.portfolio.service.AboutService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin/about")
public class AdminAboutController {

    private final AboutService aboutService;

    public AdminAboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    // =========================
    // GET
    // =========================

    @GetMapping
    public ResponseEntity<About> getAbout() {

        return ResponseEntity.ok(
                aboutService.getAboutAdmin()
        );

    }

    // =========================
    // UPDATE
    // =========================

    @PutMapping
    public ResponseEntity<About> updateAbout(
            @Valid @RequestBody AboutRequest request) {

        return ResponseEntity.ok(
                aboutService.updateAbout(request)
        );

    }

}