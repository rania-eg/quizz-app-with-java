package com.example.quizapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quiz")
    private List<Question> questions;

    // Getters and setters...
}
