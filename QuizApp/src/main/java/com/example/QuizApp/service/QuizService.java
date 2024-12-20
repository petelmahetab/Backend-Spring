package com.example.QuizApp.service;

import com.example.QuizApp.Model.Quiz;
import com.example.QuizApp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    public List<Quiz> getAll() {
        return quizDao.findAll();
    }
}
