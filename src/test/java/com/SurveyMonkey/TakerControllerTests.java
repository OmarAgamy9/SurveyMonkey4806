package com.SurveyMonkey;

import com.SurveyMonkey.taker.TakerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TakerControllerTests {

	@Autowired
	private TakerController takerPageController;

	@Test
	void contextLoads() throws Exception{
		assertThat(takerPageController).isNotNull();
	}

}