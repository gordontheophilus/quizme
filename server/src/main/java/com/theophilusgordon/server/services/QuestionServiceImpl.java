package com.theophilusgordon.server.services;

import com.theophilusgordon.server.entity.QuestionEntity;
import com.theophilusgordon.server.model.Question;
import com.theophilusgordon.server.repository.QuestionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question createQuestion(Question question) {
        QuestionEntity questionEntity = new QuestionEntity();

        BeanUtils.copyProperties(question, questionEntity);
        questionRepository.save(questionEntity);
        return question;
    }
}