package com.SurveyMonkey.model;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DropDownQuestionTest {

    DropDownQuestion ddq;

    @BeforeEach
    void setUp() {
        ddq = new DropDownQuestion(1,"Name?","Hassan","Omar");
    }

    @Test
    void getSurveyQuestion() {
        System.out.print(ddq.getQuestion());
        assertEquals("Name?",ddq.getQuestion());
    }

    @Test
    void setSurveyQuestion() {
        ddq.setSurveyQuestion("How are you?");
        assertEquals("How are you?",ddq.getQuestion());
    }

    @Test
    void getoption1() {
        assertEquals("Hassan",ddq.getoption1());
    }

    @Test
    void setoption1() {
        ddq.setoption1("Mike");
        assertEquals("Mike",ddq.getoption1());
    }

    @Test
    void getoption2() {
        assertEquals("Omar",ddq.getoption2());
    }

    @Test
    void setoption2() {
        ddq.setoption2("Megan");
        assertEquals("Megan",ddq.getoption2());
    }
}