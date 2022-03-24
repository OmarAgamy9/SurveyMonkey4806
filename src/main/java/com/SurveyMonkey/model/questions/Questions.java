package com.SurveyMonkey.model.questions;

import com.SurveyMonkey.model.questions.types.QuestionType;

import java.util.HashMap;

public class Questions {

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
