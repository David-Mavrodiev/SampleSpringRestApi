package com.movies.quotes.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAll() {
        return this.quizRepository.findAll();
    }

    public void create(Quiz quiz) {
        if (this.quizRepository.findByName(quiz.getName()).isPresent()) {
            throw new IllegalStateException("Name is already taken");
        }
        this.quizRepository.save(quiz);
    }

    public void delete(Long id) {
        if (this.quizRepository.existsById(id)) {
            throw new IllegalStateException("Id not exists");
        }
        this.quizRepository.deleteById(id);
    }

    public void update(Long id, Quiz quiz) {
        Quiz quizToUpdate = this.quizRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Id not exists"));
        quizToUpdate.setName(quiz.getName());
        this.quizRepository.save(quizToUpdate);
    }
}
