package com.movies.quotes.quiz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.*;
import java.util.List;

@Configuration
public class QuizSeed {

    @Bean
    CommandLineRunner commandLineRunner(QuizRepository repository) {
        return args -> {
            Quiz actionsQuiz = Quiz.builder()
                    .name("Science Fiction")
                    .questions(List.of(
                            QuizQuestion.builder()
                                    .description("What is the name of the movie?")
                                    .answers(List.of(
                                            "The Matrix",
                                            "The Matrix Reloaded",
                                            "The Matrix Revolutions"
                                    ))
                                    .correctAnswer("The Matrix")
                                    .build()
                    ))
                    .build();

            Quiz dramaQuiz = Quiz.builder()
                    .name("Drama")
                    .questions(List.of(
                            QuizQuestion.builder()
                                    .description("Don Vito Corleone is the head of which mafia family?")
                                    .answers(List.of(
                                            "Corleone",
                                            "Genovese",
                                            "Colombo"
                                    ))
                                    .correctAnswer("Corleone")
                                    .build()
                    ))
                    .build();

            repository.saveAll(List.of(actionsQuiz, dramaQuiz));
        };
    }
}
