package com.qascript.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Core {
    public void iniciarChrome(){
        WebDriver driver = new ChromeDriver();

    }

    public void encerrar(){
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }


}
