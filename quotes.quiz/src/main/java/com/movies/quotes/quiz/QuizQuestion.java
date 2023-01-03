package com.movies.quotes.quiz;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class QuizQuestion {
    @Id
    @SequenceGenerator(
            name = "quiz_question_sequence",
            sequenceName = "quiz_question_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "quiz_question_sequence"
    )
    private Long id;

    private String description;
    private List<String> answers;
    private String correctAnswer;
}
