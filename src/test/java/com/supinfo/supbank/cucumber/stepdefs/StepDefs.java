package com.supinfo.supbank.cucumber.stepdefs;

import com.supinfo.supbank.SupbankApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SupbankApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
