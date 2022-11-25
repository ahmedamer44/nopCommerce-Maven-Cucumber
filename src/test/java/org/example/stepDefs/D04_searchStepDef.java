package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {

    P03_homePage hom = new P03_homePage();

    @When("user search for item with keyword \"Nokia Lumia 1020\"")
    public void keywordIsEntered()
    {
    hom.searchField().sendKeys("Nokia Lumia 1020");
    }


    @And("user click on search button")
    public void userClickOnSearchButton()
    {
    hom.searchBtn().click();
    }


    @Then("user should see the search result")
    public void userShouldSeeTheSearchResult()
    {
        System.out.println(hom.searchResults().size());



    }






    // USING SKU

    @When("user type a Product Sku {string}")
    public void userTypeAProductSku(String arg0)
    {
    hom.searchField().sendKeys(arg0);
    }

    @And("user click on the search button")
    public void userClickOnTheSearchButton()
    {
    hom.searchBtn().click();
    }

    @And("user click on the shown product")
    public void userClickOnTheShownProduct()
    {
    hom.productPage().click();
    }

    @Then("user should see the result of the SKU search")
    public void userShouldSeeTheResultOfTheSKUSearch()
    {
    String actualRes = hom.actualSearchResult().getText();
        Assert.assertEquals(actualRes,"AP_MBP_13");
    }



}
