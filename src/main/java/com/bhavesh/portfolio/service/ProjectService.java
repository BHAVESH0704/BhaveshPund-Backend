package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.request.ProjectRequest;
import com.bhavesh.portfolio.dto.response.ProjectResponse;
import com.bhavesh.portfolio.entity.Project;
import com.bhavesh.portfolio.exception.ResourceNotFoundException;
import com.bhavesh.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // =========================
    // Public API
    // =========================

    public List<ProjectResponse> getProjects() {

        return projectRepository.findAll()
                .stream()
                .map(project -> new ProjectResponse(
                        project.getTitle(),
                        project.getDescription(),
                        project.getTechnologies(),
                        project.getGithubLink(),
                        project.getLiveLink(),
                        project.getImageUrl(),
                        project.getYear()
                ))
                .toList();
    }

    // =========================
    // Admin API - Create
    // =========================

    public Project createProject(ProjectRequest request) {

        Project project = new Project();

        project.setTitle(request.title());
        project.setDescription(request.description());
        project.setTechnologies(request.technologies());
        project.setGithubLink(request.githubLink());
        project.setLiveLink(request.liveLink());
        project.setImageUrl(request.imageUrl());
        project.setYear(request.year());

        return projectRepository.save(project);
    }

    // =========================
    // Admin API - Update
    // =========================

    public Project updateProject(Long id, ProjectRequest request) {

        Project project = projectRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Project not found"));

        project.setTitle(request.title());
        project.setDescription(request.description());
        project.setTechnologies(request.technologies());
        project.setGithubLink(request.githubLink());
        project.setLiveLink(request.liveLink());
        project.setImageUrl(request.imageUrl());
        project.setYear(request.year());

        return projectRepository.save(project);
    }

    // =========================
    // Admin API - Delete
    // =========================

    public void deleteProject(Long id) {

        if (!projectRepository.existsById(id)) {
            throw new ResourceNotFoundException("Project not found");
        }

        projectRepository.deleteById(id);
    }
}