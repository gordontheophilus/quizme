package com.theophilusgordon.server.controller;

import com.theophilusgordon.server.model.Question;
import com.theophilusgordon.server.services.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/questions")
    public Question createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }
}