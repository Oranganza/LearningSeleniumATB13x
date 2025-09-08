package com.tester.ex_08_Input_Select_Alerts_Radio_Checkbox;

import com.tester.ex03_Selenium_Locators.Utiles.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_25_Alerts extends CommonToAll {

    @Test
    public void test_alert() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Test");
        alert.accept();
        //alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result, "You successfully clicked an alert");
//        Assert.assertEquals(result, "You clicked: Ok");
        Assert.assertEquals(result, "You entered: Test");

        driver.quit();


    }
}
