package com.studentbeans.qa.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"com.studentbeans.qa.stepDefinition"},
        format = {"pretty","html:target/site/cucumber-pretty"},
        tags = {"@SimpleSearch"}

)



public class TestRunner {
}
