package com.tester.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_01 {

    @Test
    public void test_code()
    {
        Assert.assertEquals("pramod", "Pramod");
    }

    @Test
    public void test_open_testingAcademy()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");
    }

}
