package com.tester.ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_02
{
    @Test
    public void test_selenium()
    {
        //Start and stop itself
        // If it was a selenium 3 then we have to do this

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");
        //You need to setup the driver
    }
}
