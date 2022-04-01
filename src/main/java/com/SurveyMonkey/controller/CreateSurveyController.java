package com.SurveyMonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateSurveyController {

    @GetMapping("createSurvey")
    public String createSurvey(){
        return "createSurvey";
    }
}
