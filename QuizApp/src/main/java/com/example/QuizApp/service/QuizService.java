package com.example.QuizApp.service;

import com.example.QuizApp.Model.Quiz;
import com.example.QuizApp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    public List<Quiz> getAll() {
        return quizDao.findAll();
    }

    public List<Quiz> getQusetionByCategory(String cat) {
   return quizDao.findByCategory(cat);
    }

//    public String addNewQuestion(String questionText, String category, String correctAnswer, String optionA, String optionB, String optionC, String optionD) {
//        Quiz quiz=new Quiz();
//        quiz.setQuestionText(questionText);
//        quiz.setCategory(category);
//        quiz.setCorrectAnswer(correctAnswer);
//        quiz.setOptionA(optionA);
//        quiz.setOptionB(optionB);
//        quiz.setOptionC(optionC);
//        quiz.setOptionD(optionD);
//        //We got the 2 ref save that we need to Entity object right like .set the question and category
//        quizDao.save(quiz);
//        return "Sucess";
//    }

    public String addQue(Quiz quiz) {
        quizDao.save(quiz);
        return  "Sucess";
    }

    public String deleteQuestionById(int i) {
        //Optional is Container java 8 and for avoid Null pointer exception
        Optional<Quiz> deleteRepo=quizDao.findById(i);
        //if id present then
        if(deleteRepo.isPresent()){
            quizDao.deleteById(i);
            return "Record will be deleted.";
        }else{
            return "Not matching Record will be Found.";
        }
    }

    public String updateById(int i, Quiz updatedQuestion) {
        //steps get the Id from the Jpa and it will get it from DB
        Optional<Quiz> getId=quizDao.findById(i);
        //Check that id present or not
        if(getId.isPresent()){
            //If present then we need get question present right. get() Method.
            Quiz existingQuiz=getId.get();
//correctAnswer wali field not to be empty nor null.
            if (updatedQuestion.getCorrectAnswer() == null || updatedQuestion.getCorrectAnswer().isEmpty()) {
                return "Correct answer cannot be null or empty!";
            }


            //Set value to existingQuiz to updatedQuestion using Setter and Getter each Filed
            //Apn pehle wale question ke text ko naye wale k update kar rahe hai and Naye me Getter ki Help se le liya jayega.
            existingQuiz.setQuestionText(updatedQuestion.getQuestionText());
            existingQuiz.setOptionA(updatedQuestion.getOptionA());
            existingQuiz.setOptionB(updatedQuestion.getOptionB());
            existingQuiz.setOptionC(updatedQuestion.getOptionC());
            existingQuiz.setOptionD(updatedQuestion.getOptionD());
            existingQuiz.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
            existingQuiz.setCategory(updatedQuestion.getCategory());

            //finally save updated Question JPA -> DB
            quizDao.save(existingQuiz);
            return "New Record Updated.";
        }else{
            return "Your id is not Present";
        }
  }



}


