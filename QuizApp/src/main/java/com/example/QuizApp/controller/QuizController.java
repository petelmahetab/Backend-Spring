package com.example.QuizApp.controller;

import com.example.QuizApp.Model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.QuizApp.service.QuizService;

import java.util.List;

@RestController
@RequestMapping("/came")
public class QuizController {
    @Autowired
    QuizService QZS;
//List<Quiz>-> QZS.getAll()

    @GetMapping("/get")
    public List<Quiz> getAllQuestions() {
        return QZS.getAll();
    }

    @GetMapping("/get/{cat}")
    public List<Quiz> getQuestionByCategory(@PathVariable(value = ("cat"))  String category){
        return  QZS.getQusetionByCategory(category);
    }

    //Both are work same For Add New Question
//    @PostMapping("/add") //i need to get and set the all filed of Quiz
//    public String addNewQuestion(@RequestBody  Quiz newQuiz){
//        return QZS.addNewQuestion(
//                newQuiz.getQuestionText(), newQuiz.getCategory(),newQuiz.getCorrectAnswer()
//                ,newQuiz.getOptionA(),newQuiz.getOptionB(),newQuiz.getOptionC(),newQuiz.getOptionD());
//    }

@PostMapping("/add")
    public String addQue(@RequestBody Quiz quiz){
        return  QZS.addQue(quiz);
    }


@DeleteMapping("/delete/{id}")
   public String deleteQuestionById(@PathVariable(value = ("id")) int i){
        return  QZS.deleteQuestionById(i);
   }

   @PutMapping("/update/{id}")
    public String updateById(@PathVariable(value = ("id")) int i,@RequestBody Quiz updatedQuestion){
         return  QZS.updateById(i,updatedQuestion);
   }
}



