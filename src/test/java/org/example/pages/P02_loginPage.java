package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P02_loginPage {

    public WebElement loginBtn()
    {

        WebElement login = driver.findElement(By.className("ico-login"));
        return login;
    }

    public WebElement userEmail()
    {
    return driver.findElement(By.className("email"));

    }

    public WebElement userPassword()
    {
    return driver.findElement(By.className("password"));

    }

    public WebElement pressLoginBtn()
    {
    return driver.findElement(By.className("login-button"));
    }

    public WebElement unsuccessfulMsg ()
    {
        return driver.findElement(By.className("validation-summary-errors"));
    }

}
