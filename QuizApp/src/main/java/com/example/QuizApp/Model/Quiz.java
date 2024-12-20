package com.example.QuizApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "questions")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name ="question_text")
    private String questionText;
    @Column(name = "option_a")
    private String optionA;
    @Column(name = "option_b")
    private String optionB;
    @Column(name = "option_c")
    private String optionC;
    @Column(name = "option_d")
    private String optionD;
    @Column(name = "correct_answer")
    private String correctAnswer;

}
