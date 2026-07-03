package com.bhavesh.portfolio.controller;

import com.bhavesh.portfolio.dto.response.ProjectResponse;
import com.bhavesh.portfolio.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/api/v1/projects")
    public List<ProjectResponse> getProjects() {
        return projectService.getProjects();
    }
}