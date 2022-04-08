package com.SurveyMonkey.controller.rest;

import com.SurveyMonkey.model.CreateSurvey;
import com.SurveyMonkey.model.QType;
import com.SurveyMonkey.repositories.CreateSurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateSurveyRestController {
    @Autowired
    private CreateSurveyRepository createSurveyRepository;

    @PostMapping("saveSurvey")
    public ResponseEntity<Long> addQuestion(@RequestBody CreateSurvey survey){
        CreateSurvey saved = createSurveyRepository.save(survey);

        // TODO: Remove these print statements when no longer needed for implementation
        System.out.println(survey);
        for (QType q: survey.getQuestions()){
            System.out.println(q);
        }
        return new ResponseEntity<Long>(saved.getId(), HttpStatus.OK);
    }
}
