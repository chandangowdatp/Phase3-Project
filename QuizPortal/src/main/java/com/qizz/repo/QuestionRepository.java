package com.qizz.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qizz.model.Quizz.Question;
import com.qizz.model.Quizz.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long>{

	Set<Question> findByQuiz(Quiz quiz);

}
