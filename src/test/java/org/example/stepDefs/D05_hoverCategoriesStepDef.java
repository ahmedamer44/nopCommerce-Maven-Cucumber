package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage hov = new P03_homePage();

    @When("user hover over computers products icon")
    public void userHover () throws InterruptedException {
        WebElement element = hov.hoverActionValidation();
        Actions hover = new Actions(driver);
        hover.moveToElement(element).perform();

    }

    @And("user click on the subcategory Notebooks")
    public void userClickOnTheSubcategoryNotebooks()
    {
    hov.userSelectSubCatNotebooks().click();
    }

    @Then("user should be directed to Notebooks page")
    public void userShouldBeDirectedToNotebooksPage()
    {
    String pageRes = hov.userValidateRedirectedPage().getText();
        Assert.assertTrue(pageRes.contains("Notebooks"));

    }
}
