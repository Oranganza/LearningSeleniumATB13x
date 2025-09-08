package com.tester.ex06_Selenium_Xpath;

import com.tester.ex03_Selenium_Locators.Utiles.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_18_miniProject extends CommonToAll {


    @Description("Verify the login Page is Working")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Kajal")
    @Test
    public void test_OHRM_Login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(), "PIM");

        closeBrowser(driver);
    }


}
