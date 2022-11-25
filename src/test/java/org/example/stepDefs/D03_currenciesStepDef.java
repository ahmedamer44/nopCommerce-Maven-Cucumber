package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage home = new P03_homePage();

    @When("user select euro option")
    public void euroSymbolIsSelected()
    {
        Select dropDown = new Select(home.customerCurrency());
        dropDown.selectByVisibleText("Euro");
    }


    @Then("euro symbol is displayed")
    public void euroSymbolIsDisplayed()
    {
        for (int i=0 ; i<home.actualPriceInEuro().size() ;i++) // or i<4
        {
            String actual = home.actualPriceInEuro().get(i).getText();
            Assert.assertTrue(actual.contains("€"));
        }
    }

    @When("user select dollar option")
    public void userSelectDollarOption()
    {
        Select dropDown = new Select(home.customerCurrency());
        dropDown.selectByVisibleText("US Dollar");
    }

    @Then("dollar option is displayed back")
    public void dollarOptionIsDisplayedBack()
    {
        for (int i=0 ; i<home.actualPriceInEuro().size() ;i++) // or i<4
        {
            String actual = home.actualPriceInEuro().get(i).getText();
            Assert.assertTrue(actual.contains("$"));
        }
    }
}
