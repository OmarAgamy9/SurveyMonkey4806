package com.SurveyMonkey.model;

import static org.junit.Assert.*;

public class MultipleChoiceQuestionTest {

    MultipleChoiceQuestionModel mcQuestion = new MultipleChoiceQuestionModel();

    @org.junit.Test
    public void addQuestion() {
        mcQuestion.setQuestion("Test");
        assertEquals("Test",mcQuestion.getQuestion());
    }

    @org.junit.Test
    public void addFirstChoice() {
        mcQuestion.setOption1("Test 1");
        assertEquals("Test 1",mcQuestion.getOption1());
    }

    @org.junit.Test
    public void addSecondChoice() {
        mcQuestion.setOption2("Test 2");
        assertEquals("Test 2",mcQuestion.getOption1());
    }

    @org.junit.Test
    public void addThirdChoice() {
        mcQuestion.setOption1("Test 3");
        assertEquals("Test 3",mcQuestion.getOption1());
    }

    @org.junit.Test
    public void addFourthChoice() {
        mcQuestion.setOption1("Test 4");
        assertEquals("Test 4",mcQuestion.getOption1());
    }




}