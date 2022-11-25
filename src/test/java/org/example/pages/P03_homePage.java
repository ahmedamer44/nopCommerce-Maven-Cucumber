package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {

    public WebElement customerCurrency()
    {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> actualPriceInEuro()
    {
        return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }


   // FOR D04 SEARCH


    public WebElement searchField()
    {
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchBtn()
    {
        return driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> searchResults()
    {
        return driver.findElements(By.cssSelector("a[href=\"/nokia-lumia-1020\"]"));
    }

    public WebElement productPage()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
    }

    public WebElement actualSearchResult()
    {
        return driver.findElement(By.id("sku-4"));
    }



    // FOR D05 HOVER ACTIONS

    public WebElement hoverActionValidation() throws InterruptedException {

        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));


    }

    public WebElement userSelectSubCatNotebooks ()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));

    }

    public WebElement userValidateRedirectedPage()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));
    }




    // For HOME SLIDERS ACTIONS

    public WebElement userClickNokiaSlider()
    {
        return driver.findElement(By.className("nivo-imageLink"));
    }

    public WebElement userClickIphoneSlider1()
    {
        return driver.findElement(By.className("nivo-control"));
    }
    public WebElement userClickIphoneSlider2()
    {
        return driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
    }

    public WebElement urlVisibility()
    {
        return driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
    }




    // FOR FOLLOW US STEP


    public WebElement facebookClick()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));

    }


    public WebElement twitterClick()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
    }

    public WebElement rssClick()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
    }

    public WebElement youtubeClick()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
    }



    //FOR WISHLIST


    public WebElement successMsgAppears()
    {
        return driver.findElement(By.className("content"));

    }

    public WebElement successMsgColor()
    {
        return driver.findElement(By.className("bar-notification"));
    }

    public WebElement mainWishlistButton()
    {
        return driver.findElement(By.className("wishlist-label"));
    }

    public WebElement wishlistQty()
    {
        return driver.findElement(By.className("qty-input"));
    }


}
