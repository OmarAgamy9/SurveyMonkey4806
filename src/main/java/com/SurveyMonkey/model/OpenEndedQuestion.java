package com.SurveyMonkey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OpenEndedQuestion extends QType {
    @Id
    @Column(name="MCQID")
    String mcqid;
    private String surveyQuestion;
    private String openEndedAnswer;


    public OpenEndedQuestion() {
    }

    public OpenEndedQuestion(String surveyQuestion, String openEndedAnswer) {
        this.openEndedAnswer = openEndedAnswer;
        this.surveyQuestion = surveyQuestion;

    }

    public void setQuestion(String surveyQuestion) {
        this.surveyQuestion= surveyQuestion;
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
                "Question: [question='%s', OpenEndedAnswer='%s']",
                 surveyQuestion, openEndedAnswer);
    }



}
