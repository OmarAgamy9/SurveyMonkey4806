package com.SurveyMonkey.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CreateSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<QType> questions;

    public CreateSurvey() {
        questions = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<QType> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QType> questionsMade) {
        this.questions = questionsMade;
    }

    public void addQuestion(QType question) {
        questions.add(question);
    }

    public void removeQuestion(QType question) {
        questions.remove(question);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Id: %d - Title: %s - Number of questions: [number=%d]",
                this.getId(), this.title, this.questions.size());
    }

}
