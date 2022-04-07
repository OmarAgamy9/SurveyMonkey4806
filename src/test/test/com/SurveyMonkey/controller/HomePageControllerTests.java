package com.SurveyMonkey.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.SurveyMonkey.controller.HomePageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class HomePageControllerTests {

    @Autowired
    private HomePageController homePageController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(homePageController).isNotNull();
    }
}
