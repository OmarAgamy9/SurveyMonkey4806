package com.SurveyMonkey.model;

import javax.persistence.Entity;

@Entity
public class MultipleChoiceQuestionModel extends QType {

	private String option1;
	private String option2;
	private String option3;
	private String option4;

	public MultipleChoiceQuestionModel() {
	}

	public MultipleChoiceQuestionModel(Integer number, String surveyQuestion, String option1, String option2,
									   String option3, String option4) {

		this.setNumber(number);
		this.setQuestion(surveyQuestion);
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String choiceOne) {
		this.option1 = choiceOne;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String choiceTwo) {
		this.option2 = choiceTwo;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String choiceThree) {
		this.option3 = choiceThree;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String choiceFour) {
		this.option4 = choiceFour;
	}

	@Override
	public String toString() {
		return String.format(
				"Question: [id=%d, number='%s', question='%s', option1='%s', option2='%s', option3='%s',option4='%s']",
				this.getId(), this.getNumber(), this.getQuestion(), option1, option2, option3, option4);
	}

}
