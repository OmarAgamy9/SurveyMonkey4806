package com.SurveyMonkey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MultipleChoiceQuestionModel extends QType {

	@Id
	@Column(name="MCQID")
	String mcqid;
	private String surveyQuestion;
	private String choiceOne;
	private String choiceTwo;
	private String choiceThree;
	private String choiceFour;

	public MultipleChoiceQuestionModel() {
	}

	public MultipleChoiceQuestionModel(String surveyQuestion, String choiceOne, String choiceTwo,
			String choiceThree, String choiceFour) {
		this.choiceOne = choiceOne;
		this.choiceTwo = choiceTwo;
		this.choiceThree = choiceThree;
		this.choiceFour = choiceFour;
	}

	public void setQuestion(String surveyQuestion) {
		this.surveyQuestion=surveyQuestion;
	}

	public String getSurveyQuestion(){
		return this.surveyQuestion;
	}

	public String getChoiceOne() {
		return choiceOne;
	}

	public void setChoiceOne(String choiceOne) {
		this.choiceOne = choiceOne;
	}

	public String getChoiceTwo() {
		return choiceTwo;
	}

	public void setChoiceTwo(String choiceTwo) {
		this.choiceTwo = choiceTwo;
	}

	public String getChoiceThree() {
		return choiceThree;
	}

	public void setChoiceThree(String choiceThree) {
		this.choiceThree = choiceThree;
	}

	public String getChoiceFour() {
		return choiceFour;
	}

	public void setChoiceFour(String choiceFour) {
		this.choiceFour = choiceFour;
	}

	@Override
	public String toString() {
		return String.format(
				"Question: [question='%s', choice1='%s', choice2='%s',choice3='%s',choice4='%s']",
				surveyQuestion, choiceOne, choiceTwo, choiceThree, choiceFour);
	}

}
