package com.qascript;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:/java_dev/DTAR/Automacoes/automationTemplate/AutomacaoV1/src/test/resources/feature/Login.feature"},
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        }
)

public class TestRunner {

}


