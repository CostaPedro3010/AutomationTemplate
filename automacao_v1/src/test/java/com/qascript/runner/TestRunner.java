package com.qascript.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature/"},
//        features = "src/test/resources/features/",
        glue = "com.qascript.steps",
        tags = "@demo",
        plugin = {"pretty", "html:target/cucumber-reports"}


)

public class TestRunner {

}


