package com.dekosas.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/pasarPorCaja.feature",
        glue = "com.dekosas.StepDefinitions",
        snippets = SnippetType.CAMELCASE)


public class PasarPorCajaRunner {
}
