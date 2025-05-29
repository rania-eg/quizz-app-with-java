package com.example.quizapp.service;

import com.example.quizapp.model.Quiz;
import com.example.quizapp.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
