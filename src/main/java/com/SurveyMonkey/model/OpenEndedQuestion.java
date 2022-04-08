package com.SurveyMonkey.model;

import javax.persistence.Entity;

@Entity
public class OpenEndedQuestion extends QType {

    public OpenEndedQuestion() {
    }

    public OpenEndedQuestion(Integer number, String surveyQuestion) {
        this.setNumber(number);
        this.setQuestion(surveyQuestion);

    }

    @Override
    public String toString() {
        return String.format(
                "Question: [id=%d, number='%s', question='%s']",
                getId(), getNumber(), this.getQuestion());
    }

}
