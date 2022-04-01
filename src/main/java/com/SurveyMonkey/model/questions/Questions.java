package com.SurveyMonkey.model.questions;

import com.SurveyMonkey.model.questions.types.QuestionType;

import javax.persistence.*;
import java.util.HashMap;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @SuppressWarnings("JpaAttributeTypeInspection")
    private HashMap<Integer, QuestionType> questions;


    public Questions() {
    }

    public HashMap<Integer, QuestionType> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<Integer, QuestionType> questions) {
        this.questions = questions;
    }
}
