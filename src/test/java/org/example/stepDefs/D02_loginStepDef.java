package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {

    P02_loginPage log = new P02_loginPage();

    @Given("user go to login page")
    public void userLogin()
    {
        log.loginBtn().click();
    }


    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1)
    {
    log.userEmail().sendKeys(arg0);
    log.userPassword().sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton()
    {
    log.pressLoginBtn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {
        SoftAssert soft = new SoftAssert();
        String currentUrl = driver.getCurrentUrl();
        soft.assertEquals(currentUrl,"https://demo.nopcommerce.com/");

        boolean buttonVisibility = driver.findElement(By.className("ico-account")).isDisplayed();
        soft.assertEquals(buttonVisibility,true);


        soft.assertAll();
    }





    @Given("user go to login page again")
    public void userGoToLoginPageAgain()
    {
    log.loginBtn().click();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1)
    {
    log.userEmail().sendKeys(arg0);
    log.userPassword().sendKeys(arg1);
    }

    @And("user press on login button again")
    public void userPressOnLoginButtonAgain()
    {
    log.pressLoginBtn().click();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem()
    {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(log.unsuccessfulMsg().isDisplayed());

        String rgba = log.unsuccessfulMsg().getCssValue("color");
        String hex = Color.fromString(rgba).asHex();
        soft.assertEquals(hex,"#e4434b");


        soft.assertAll();
    }
}
