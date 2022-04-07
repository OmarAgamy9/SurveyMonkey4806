package com.SurveyMonkey.model;

import javax.persistence.Entity;

@Entity
public class OpenEndedQuestion extends QType {
    private String surveyQuestion;
    private String openEndedAnswer;

    public OpenEndedQuestion() {
    }

    public OpenEndedQuestion(String surveyQuestion, String openEndedAnswer) {
        this.surveyQuestion=surveyQuestion;
        this.openEndedAnswer = openEndedAnswer;
    }


    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }


    public String getOpenEndedAnswer() {
        return openEndedAnswer;
    }

    public void setOpenEndedAnswer(String choiceOne) {
        this.openEndedAnswer = choiceOne;
    }

    @Override
    public String toString() {
        return String.format(
                "Question: [id=%d, number='%s', question='%s', OpenEndedAnswer='%s']",
                getId(), getNumber(), surveyQuestion, openEndedAnswer);
    }



}
