package com.tester.ex02_Selenium_Basics;

import com.google.common.base.Verify;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_09_ProjectNo01 {

    @Description("TC#1 - Verify that a particular text exists on the katalon")
    @Link("https://bugz.atlassion.net/browser/VP-1")
    @Test
    public void  test_verify_test_katalon()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("Testcase Passsed!!");
            Assert.assertTrue(true);
        }
            else
            {
                System.out.println("Testcase Failed");
                Assert.fail();

            }
            driver.quit();
        }
    }

