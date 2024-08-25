package com.example.projectmanagement.service;

import com.example.projectmanagement.model.Project;
import com.example.projectmanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findByUserId(Long userId) {
        return projectRepository.findByUserId(userId);
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
