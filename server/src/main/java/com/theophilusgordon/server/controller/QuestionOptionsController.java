package com.theophilusgordon.server.controller;

import com.theophilusgordon.server.model.QuestionOptions;
import com.theophilusgordon.server.services.QuestionOptionsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class QuestionOptionsController {
    private final QuestionOptionsService questionOptionsService;

    public QuestionOptionsController(QuestionOptionsService questionOptionsService) {
        this.questionOptionsService = questionOptionsService;
    }

     @PostMapping("/question-options")
     public QuestionOptions createOptions(@RequestBody QuestionOptions questionOptions){
         return questionOptionsService.createQuestionOptions(questionOptions);
     }
}