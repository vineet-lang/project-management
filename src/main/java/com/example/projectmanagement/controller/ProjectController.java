package com.example.projectmanagement.controller;

import com.example.projectmanagement.model.Project;
import com.example.projectmanagement.repository.ProjectRepository;
import com.example.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectRepository projectRepository;
    @GetMapping("/getAllProjects")
    public List<Project> getAllProjects() {
        try{
            return projectRepository.findAll();
        }
        catch (Exception e) {
            if(e==null) throw new RuntimeException("Internal Server Error");
            else throw e;
        }

    }

    @GetMapping("/user/{userId}")
    public List<Project> getUserProjects(@PathVariable Long userId) {
        return projectService.findByUserId(userId);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.save(project);
    }
}
