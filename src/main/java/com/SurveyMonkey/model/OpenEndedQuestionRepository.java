package com.SurveyMonkey.model;

import com.SurveyMonkey.model.MultipleChoiceQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "openEndedData")
public interface OpenEndedQuestionRepository extends CrudRepository<OpenEndedQuestion, Long> {
}
