package com.qascript.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


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
        assertEquals(text.getText(), txt);
        driver.quit();
    }


    @Given("User enters invalid username in the username field")
    public void userEntersInvalidUsernameInTheUsernameField() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver113/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/");
        WebElement User = driver.findElement(By.cssSelector("input[name='username']"));
        User.sendKeys("Demouser");
    }

    @And("User enters invalid password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("abc123");
    }

    @Then("User is not logged in when checking error message {string}")
    public void userIsNotLoggedInWhenCheckingErrorMessage(String txtError) {
        WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Wrong username or password')]"));
        text.getText();
        assertEquals(text.getText(), txtError);
        driver.quit();

    }

    @Dado("que estou na pagina Register com o titulo {string}")
    public void queEstouNaPaginaRegisterComOTitulo(String value) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver113/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        wait(2000);
        String textoElement = driver.findElement(By.cssSelector("div[class='col-sm-8 col-xs-8 col-md-8']")).getText();
        assertEquals("Automation Demo Site", textoElement);


    }

    @Quando("o campo firstName esta preenchido com {string}")
    public void oCampoFirstNameEstaPreenchidoCom(String Value) {
        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstName.sendKeys(Value);
    }

    @E("o campo lastName esta preenchido com {string}")
    public void oCampoLastNameEstaPreenchidoCom(String Value) {
        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastName.sendKeys(Value);
    }
    @Quando("os campos do formulario estao preenchidos com dados validos")
    public void osCamposDoFormularioEstaoPreenchidosComDadosValidos() {
        WebElement Address = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
    }
}
