package com.theophilusgordon.server.controller;

import com.theophilusgordon.server.model.CorrectOption;
import com.theophilusgordon.server.services.CorrectOptionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CorrectOptionController {
    private final CorrectOptionService correctOptionService;

    public CorrectOptionController(CorrectOptionService correctOptionService) {
        this.correctOptionService = correctOptionService;
    }

     @PostMapping("/correct-option")
     public CorrectOption createCorrectOption(@RequestBody CorrectOption correctOption){
         return correctOptionService.createCorrectOption(correctOption);
     }
}