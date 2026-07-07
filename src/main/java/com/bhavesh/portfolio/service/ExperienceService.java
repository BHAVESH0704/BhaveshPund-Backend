package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.ExperienceRequest;
import com.bhavesh.portfolio.dto.response.ExperienceResponse;
import com.bhavesh.portfolio.entity.Experience;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    private final ExperienceRepository repository;

    public ExperienceService(ExperienceRepository repository) {
        this.repository = repository;
    }

    // =========================
    // Public API
    // =========================

    public List<ExperienceResponse> getExperience() {

        return repository.findAll()
                .stream()
                .map(e -> new ExperienceResponse(
                        e.getCompany(),
                        e.getRole(),
                        e.getDuration(),
                        e.getDescription()
                ))
                .toList();
    }

    // =========================
    // Admin API - Get All
    // =========================

    public List<Experience> getAllExperience() {

        return repository.findAll();

    }

    // =========================
    // Admin API - Create
    // =========================

    public Experience createExperience(ExperienceRequest request) {

        Experience experience = new Experience();

        experience.setCompany(request.company());
        experience.setRole(request.role());
        experience.setDuration(request.duration());
        experience.setDescription(request.description());

        return repository.save(experience);
    }

    // =========================
    // Admin API - Update
    // =========================

    public Experience updateExperience(Long id, ExperienceRequest request) {

        Experience experience = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Experience not found"));

        experience.setCompany(request.company());
        experience.setRole(request.role());
        experience.setDuration(request.duration());
        experience.setDescription(request.description());

        return repository.save(experience);
    }

    // =========================
    // Admin API - Delete
    // =========================

    public void deleteExperience(Long id) {

        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Experience not found");
        }

        repository.deleteById(id);
    }

}