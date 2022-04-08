package com.SurveyMonkey.controller;

import com.SurveyMonkey.service.SurveyService;
import com.SurveyMonkey.model.CreateSurvey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SurveyController {
    @Autowired private SurveyService service;

    @GetMapping("/surveyorHome")
    public String showSurveyResults(){
        return "surveyorHome";
    }

    @GetMapping("/createSurvey")
    public String createSurvey(){
        return "createSurvey";
    }

    @GetMapping("/finishCreate")
    public String finishCreate() {
        return "finishCreate";
    }
}
