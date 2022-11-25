package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver = null;
    @Before
    public void openBrowser ()
    {
        //System.out.println("user open chrome browser");
        // 1 - define setProperty
        //System.setProperty("webdriver.chrome.driver","/Users/ahmadamer/Downloads/chromedriver");
        WebDriverManager.chromedriver().setup();
        // 2 - create new object from chromedriver
        driver = new ChromeDriver();
        // 3- Configuration of driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //4- Navigate
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void quitDriver() throws InterruptedException
    {
        //System.out.println("quit driver");
        Thread.sleep(5000);
        driver.quit();

    }


}
