package com.example.QuizApp.controller;

import com.example.QuizApp.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.QuizApp.service.QuizService;

import java.util.List;

@RestController
@RequestMapping("/came")
public class QuizController {
    @Autowired
    QuizService QZS;
//List<Quiz>-> QZS.getAll()
    @GetMapping("/list")
    public List<Quiz> getAll() {

        return QZS.getAll();
    }
}



