package com.qascript.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature/Login.feature"},

        tags = "@LoginTest",

        glue = "steps",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE


)

public class TestRunner {

}


