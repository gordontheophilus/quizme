package com.theophilusgordon.server.services;

import com.theophilusgordon.server.entity.QuizEntity;
import com.theophilusgordon.server.model.Quiz;
import com.theophilusgordon.server.repository.QuizRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService{
    private QuizRepository quizRepository;
    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        QuizEntity quizEntity = new QuizEntity();

        BeanUtils.copyProperties(quiz, quizEntity);
        quizRepository.save(quizEntity);
        return quiz;
    }
}