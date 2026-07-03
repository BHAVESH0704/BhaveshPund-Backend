package com.bhavesh.portfolio.service;

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
}