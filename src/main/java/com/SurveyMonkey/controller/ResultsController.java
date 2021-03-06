package com.SurveyMonkey.controller;

import com.SurveyMonkey.model.CreateSurvey;
import com.SurveyMonkey.repositories.SurveyRepository;
import com.SurveyMonkey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultsController {
    @Autowired
    private SurveyService service;

    @GetMapping("/surveyResults/{id}")
    public String displaySurveyResults(@PathVariable("id") Integer id, Model model) {
        CreateSurvey survey = service.get(id);
        model.addAttribute("surveyResults", survey);
        model.addAttribute("title_page", "Survey Results");
        return "surveyResults";
    }
}
