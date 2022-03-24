package com.SurveyMonkey.model.questions.types;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class QuestionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int number;
    protected String question;


    /**
     * Default Constructor
     */
    public QuestionType(){
    }

    /**
     * A constructor
     * @param question
     */
    public QuestionType(String question){
        this.question = question;

    }

    /**
     *
     * @return
     */
    public int getId() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setId(int number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }
}
