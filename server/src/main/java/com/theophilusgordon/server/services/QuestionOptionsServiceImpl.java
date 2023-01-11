package com.theophilusgordon.server.services;

import com.theophilusgordon.server.entity.QuestionOptionsEntity;
import com.theophilusgordon.server.model.QuestionOptions;
import com.theophilusgordon.server.repository.QuestionOptionsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class QuestionOptionsServiceImpl implements QuestionOptionsService {
    private QuestionOptionsRepository questionOptionsRepository;

    public QuestionOptionsServiceImpl(QuestionOptionsRepository questionOptionsRepository) {
        this.questionOptionsRepository = questionOptionsRepository;
    }

    @Override
    public QuestionOptions createQuestionOptions(QuestionOptions questionOptions) {
        QuestionOptionsEntity questionOptionsEntity = new QuestionOptionsEntity();

        BeanUtils.copyProperties(questionOptions, questionOptionsEntity);
        questionOptionsRepository.save(questionOptionsEntity);
        return questionOptions;
    }
}