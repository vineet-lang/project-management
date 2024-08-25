package com.example.projectmanagement.controller;

import com.example.projectmanagement.model.Task;
import com.example.projectmanagement.repository.TaskRepository;
import com.example.projectmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/getAllTasks")
    public List<Task>getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/project/{projectId}")
    public List<Task> getProjectTasks(@PathVariable Long projectId) {
        return taskService.findByProjectId(projectId);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.save(task);
    }
}
