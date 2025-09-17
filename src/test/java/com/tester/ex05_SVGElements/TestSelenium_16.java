package com.tester.ex05_SVGElements;

import com.tester.ex_09_WaitHelper.waitHelpers;
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
    public void test_FlipKart_Search_icon() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElement = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElement.get(0).click();

        waitHelpers waithelper = new waitHelpers();
        waithelper.waitForVisibility(driver, 5, "//div[contains(@data-id, CPU)]");

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }

        driver.quit();

    }
}
