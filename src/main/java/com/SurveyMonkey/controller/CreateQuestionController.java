package com.SurveyMonkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateQuestionController {

	@GetMapping("/createSurvey")
	public String createSurvey() {
		return "createSurvey";
	}

	@GetMapping("/createMCQuestion")
	public String mcQuestion() {
		return "createMCQuestion";
	}

	@GetMapping("/createOEQuestion")
	public String oeQuestion() {
		return "createOEQuestion";
	}

	@GetMapping("/createDDQuestion")
	public String ddQuestion() {
		return "createDDQuestion";
	}

	@GetMapping("/createSurvey")
	public String createSurvey() {
		return "createSurvey";
	}

}
