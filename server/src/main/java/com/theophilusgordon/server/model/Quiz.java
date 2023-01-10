package com.theophilusgordon.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class Quiz {
    private long id;
    private String quizName;
    private Date quizDeadline;
}