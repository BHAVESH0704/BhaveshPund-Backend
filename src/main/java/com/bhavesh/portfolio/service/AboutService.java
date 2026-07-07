package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.AboutRequest;
import com.bhavesh.portfolio.dto.response.AboutResponse;
import com.bhavesh.portfolio.entity.About;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.AboutRepository;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    // =========================
    // Public API
    // =========================

    public AboutResponse getAbout() {

        About about = aboutRepository.findFirstBy();

        if (about == null) {
            throw new ResourceNotFoundException("About information not found");
        }

        return new AboutResponse(
                about.getName(),
                about.getRole(),
                about.getCollege(),
                about.getDegree(),
                about.getLocation(),
                about.getEmail()
        );
    }

    // =========================
    // Admin API - Get
    // =========================

    public About getAboutAdmin() {

        About about = aboutRepository.findFirstBy();

        if (about == null) {
            throw new ResourceNotFoundException("About information not found");
        }

        return about;

    }

    // =========================
    // Admin API - Update
    // =========================

    public About updateAbout(AboutRequest request) {

        About about = aboutRepository.findFirstBy();

        if (about == null) {
            throw new ResourceNotFoundException("About information not found");
        }

        about.setName(request.name());
        about.setRole(request.role());
        about.setCollege(request.college());
        about.setDegree(request.degree());
        about.setLocation(request.location());
        about.setEmail(request.email());

        return aboutRepository.save(about);

    }

}