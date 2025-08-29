package com.tester.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium_12_LinkText_Partial_LinkText {

    @Description("TC#1 - Verify VWO")
    @Owner("Kajal")
    @Test
    public void test_login_vwo() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        //driver.findElement(By.linkText("Start a free trial")).click();

        driver.findElement(By.partialLinkText("trial")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

}
