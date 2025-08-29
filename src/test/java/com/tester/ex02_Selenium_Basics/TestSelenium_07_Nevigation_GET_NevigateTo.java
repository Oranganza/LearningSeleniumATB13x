package com.tester.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_07_Nevigation_GET_NevigateTo {


    @Description("Open the URL")
    @Test
    public void test_selenium01()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


        //Navigate command
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        

    }
}
