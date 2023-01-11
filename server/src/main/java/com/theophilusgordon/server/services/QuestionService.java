package com.theophilusgordon.server.services;

import com.theophilusgordon.server.model.Question;

public interface QuestionService {
    Question createQuestion(Question question);
}