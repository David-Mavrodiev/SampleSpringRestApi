package com.movies.quotes.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    //@Query("SELECT q FROM Quiz q WHERE q.name = ?1")
    Optional<Quiz> findByName(String name);
}
