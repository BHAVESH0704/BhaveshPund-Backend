package com.bhavesh.portfolio.service;

import com.bhavesh.portfolio.dto.response.ProjectResponse;
import com.bhavesh.portfolio.entity.Project;
import com.bhavesh.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

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
}