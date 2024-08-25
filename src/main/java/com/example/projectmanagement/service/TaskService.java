package com.example.projectmanagement.service;

import com.example.projectmanagement.model.Task;
import com.example.projectmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findByProjectId(Long projectId) {
        return taskRepository.findByProjectId(projectId);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
