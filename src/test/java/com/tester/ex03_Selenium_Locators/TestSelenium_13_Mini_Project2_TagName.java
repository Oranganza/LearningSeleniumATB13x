package com.tester.ex03_Selenium_Locators;

import com.tester.ex03_Selenium_Locators.Utiles.CommonToAll;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_13_Mini_Project2_TagName extends CommonToAll {

    @Owner("Kajal")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        driver.findElement(By.partialLinkText("trial")).click();

//       System.out.println(driver.getCurrentUrl());
//       Assert.assertTrue(driver.getCurrentUrl().contains("free trial"));

        driver.findElement(By.id("page-v1-step1-email")).sendKeys("abc");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        driver.findElement(By.tagName("button")).click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        closeBrowser(driver);

    }
}
