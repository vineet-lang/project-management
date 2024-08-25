package com.example.projectmanagement.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
