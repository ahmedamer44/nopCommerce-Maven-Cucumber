package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D08_WishlistStepDef {

    P03_homePage wish = new P03_homePage();

    // 1st SCENARIO
    @When("user click on add to wishlist button for the product")
    public void userClickWishlistBTN()
    {
        List<WebElement> wishlists = driver.findElements(By.className("add-to-wishlist-button"));
        wishlists.get(2).click();
        // wish.wishlistFirstBtn().click();
    }


    @Then("user should see the success message")
    public void userShouldSeeTheSuccessMessage()
    {
        String actualMsg = wish.successMsgAppears().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualMsg.contains("The product has been added to your wishlist"));

        String actualColor = wish.successMsgColor().getCssValue("background-color");
        soft.assertTrue(actualColor.contains("75, 176, 122, 1"));

        soft.assertAll();

    }

    // 2nd SCENARIO

    @When("user click on add to wishlist button to add product")
    public void userClickOnAddToWishlistButtonToAddProduct()
    {

        List<WebElement> wishlists = driver.findElements(By.className("add-to-wishlist-button"));
        wishlists.get(2).click();

    }

    @And("user wait for the success message to disappear")
    public void userWaitForTheSuccessMessageToDisappear()
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement greenLine = wish.successMsgColor();
        wait.until(ExpectedConditions.invisibilityOf(greenLine));

    }

    @Then("user should verify quantity value")
    public void userShouldVerifyQuantityValue()
    {

    wish.mainWishlistButton().click();

    WebElement wishValue = wish.wishlistQty();
    String wishQty = wishValue.getAttribute("value");

    Assert.assertTrue(Integer.parseInt(wishQty) > 0);


    }


}
