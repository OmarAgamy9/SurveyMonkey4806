package com.SurveyMonkey.model;

import com.SurveyMonkey.model.questions.types.QType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DropDownQuestion extends QType {

    private Integer number;
    private String surveyQuestion;
    private String option1;
    private String option2;

    public DropDownQuestion() {
    }

    public DropDownQuestion(Integer number, String surveyQuestion, String option1, String option2) {
        this.number = number;
        this.surveyQuestion = surveyQuestion;
        this.option1 = option1;
        this.option2 = option2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(String question) {
        this.surveyQuestion = question;
    }

    public String getoption1() {
        return option1;
    }

    public void setoption1(String option1) {
        this.option1 = option1;
    }

    public String getoption2() {
        return option2;
    }

    public void setoption2(String option2) {
        this.option2 = option2;
    }

    @Override
    public String toString() {
        return String.format(
                "Question: [id=%d, number='%s', question='%s', option1='%s', option2='%s']",
                this.getId(), number, surveyQuestion, option1, option2);
    }
    public static void main(String[] args) {
        DropDownQuestion question = new DropDownQuestion(1,"name?","hassan","nasr");
        System.out.print(question.getSurveyQuestion());
    }
}
