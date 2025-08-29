package com.tester.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium_11_Task
{
    @Description("TC#1 - Verify VWO")
    @Owner("Kajal")
    @Test
    public void test_vwo_free_trial()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.findElement(By.linkText("Start a free trial")).click();
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("abc");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        driver.findElement(By.partialLinkText("Create a Free Trial Account")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        //*[@id="page-free-trial-signup-form-step1"]/div[1]/div
        //div[@class='invalid-reason']


        driver.findElement(By.partialLinkText("The email address"));
        System.out.println();

        //assert
        driver.quit();
    }
}
