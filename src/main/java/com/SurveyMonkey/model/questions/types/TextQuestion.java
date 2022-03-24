package com.SurveyMonkey.model.questions.types;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collection;

/*
 * A class to store open ended questions
 */
@Entity
public class TextQuestion extends QuestionType {

    @ElementCollection
    private Collection<String> answers = new ArrayList<>();

    /*
     * A default constructor
     */
    public TextQuestion() {
        super();
    }

    /**
     *
     * @param question
     */
    public TextQuestion(String question) {
        super(question);
    }


    /**
     * Retrieves the answers
     * @return collection of String
     */
    public Collection<String> getAnswers() {
        return answers;
    }


    /**
     * Sets the answers
     * @param answers
     */
    public void setAnswers(Collection<String> answers) {
        this.answers = answers;
    }

    /**
     * Adds a new answer
     * @param answer
     */
    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

}