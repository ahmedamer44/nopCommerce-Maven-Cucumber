package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage follow = new P03_homePage();

    // FOR FACEBOOK

    @When("user opens facebook link")
    public void userClickOnFbIcon() throws InterruptedException
    {

        follow.facebookClick().click();
        Thread.sleep(3000);

    }


    @Then("Facebook is opened in new tab")
    public void facebookIsOpenedInNewTab()
    {

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String faceURL = driver.getCurrentUrl();
        Assert.assertEquals(faceURL,"https://www.facebook.com/nopCommerce");

    }



    //FOR TWITTER

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException
    {
        follow.twitterClick().click();
        Thread.sleep(3000);
    }

    @Then("Twitter is opened in new tab")
    public void twitterIsOpenedInNewTab()
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String twitterResult = driver.getCurrentUrl();
        Assert.assertEquals(twitterResult,"https://twitter.com/nopCommerce");
    }



    //FOR RSS

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException
    {

        follow.rssClick().click();
        Thread.sleep(3000);
    }

    @Then("RSS is opened in new tab")
    public void rssIsOpenedInNewTab()
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String rssResult = driver.getCurrentUrl();
        Assert.assertEquals(rssResult,"https://demo.nopcommerce.com/new-online-store-is-open");
    }



    //FOR YOUTUBE

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException
    {

        follow.youtubeClick().click();
        Thread.sleep(3000);
    }

    @Then("YOUTUBE is opened in new tab")
    public void youtubeIsOpenedInNewTab()
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        String youtubeResult = driver.getCurrentUrl();
        Assert.assertEquals(youtubeResult,"https://www.youtube.com/user/nopCommerce");
    }
}
