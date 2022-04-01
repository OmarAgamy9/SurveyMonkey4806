package com.SurveyMonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateSurveyController {

    @GetMapping("createSurvey")
    public String createSurvey(){
        return "createSurvey";
    }

}
