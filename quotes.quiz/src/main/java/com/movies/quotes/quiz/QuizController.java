package com.movies.quotes.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/quiz")
public class QuizController {
    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> getAll() {
        return this.quizService.getAll();
    }

    @PostMapping
    public void create(@RequestBody Quiz quiz) {
        this.quizService.create(quiz);
    }

    @DeleteMapping(path = "{quizId}")
    public void delete(@PathVariable(name = "quizId") Long id) {
        this.quizService.delete(id);
    }

    @PutMapping(path = "{quizId}")
    public void update(@PathVariable(name = "quizId") Long id, @RequestBody Quiz quiz) {
        this.quizService.update(id, quiz);
    }
}
