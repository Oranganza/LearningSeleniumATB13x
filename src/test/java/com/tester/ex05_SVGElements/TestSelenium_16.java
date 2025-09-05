package com.tester.ex05_SVGElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_16 {

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElement = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElement.get(0).click();
    }

}