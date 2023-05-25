package com.qascript.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepsDefs {

    private WebDriver driver = new ChromeDriver();


    @Given("User enters valid username in the username field")
    public void userEntersValidUsernameInTheUsernameField() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver113/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/");
        WebElement User = driver.findElement(By.cssSelector("input[name='username']"));
        User.sendKeys("demouser");
    }

    @And("User enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("abc123");
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        WebElement btnLogin = driver.findElement(By.cssSelector("button[id='btnLogin']"));
        btnLogin.click();
    }

    @Then("The user is successfully logged in when checking the message {string}")
    public void theUserIsSuccessfullyLoggedInWhenCheckingTheMessage(String txt) {
        WebElement text = driver.findElement(By.cssSelector("h2[class='mt-5']"));
        text.getText();
        Assert.assertEquals(text.getText(), txt);
        driver.quit();
    }
}
