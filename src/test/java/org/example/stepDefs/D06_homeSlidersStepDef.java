package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
    P03_homePage homes = new P03_homePage();


    @When("user click on nokia lumia home slider")
    public void userClickFirstHomeSlider()
    {
    homes.userClickNokiaSlider().click();
    }


    @Then("user should be redirected to The Nokia product page")
    public void userShouldBeRedirectedToTheNokiaProductPage()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement newURL = homes.urlVisibility();
        wait.until(ExpectedConditions.visibilityOf(newURL));

        String pageCurURL = homes.urlVisibility().getText();
        Assert.assertTrue(pageCurURL.contains("https://demo.nopcommerce.com/nokia-lumia-1020"));


    }








    @When("user click on iphone home slider")
    public void userClickOnIphoneHomeSlider()
    {
    homes.userClickIphoneSlider1().click();
    homes.userClickIphoneSlider2().click();
    }

    @Then("user should be directed to the iphone product page")
    public void userShouldBeDirectedToTheIphoneProductPage()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement newURL = homes.urlVisibility();
        wait.until(ExpectedConditions.visibilityOf(newURL));

        String pageCurURL = homes.urlVisibility().getText();
        Assert.assertTrue(pageCurURL.contains("https://demo.nopcommerce.com/iphone-6"));

    }
}
