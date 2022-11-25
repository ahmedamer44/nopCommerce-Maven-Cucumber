package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {

    public WebElement registerBtn()
    {
        WebElement register = driver.findElement(By.className("ico-register"));
        return register;

    }

    public WebElement genderType()
    {
        return driver.findElement(By.id("gender-male"));

    }

    public WebElement firstName()
    {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement dayList()
    {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement monthList()
    {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement yearList()
    {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return driver.findElement(By.id("Email"));
    }

    public WebElement password()
    {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registrationBtn()
    {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement message()
    {
        return driver.findElement(By.className("result"));
    }





}
