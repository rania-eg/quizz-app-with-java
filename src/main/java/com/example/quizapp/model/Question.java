package com.example.quizapp.model;

import jakarta.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private String correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    // Getters and setters...
}
