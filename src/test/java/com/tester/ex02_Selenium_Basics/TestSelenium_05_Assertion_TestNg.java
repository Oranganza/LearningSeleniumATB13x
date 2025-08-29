package com.tester.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSelenium_05_Assertion_TestNg {

    @Description("Verify that the title is Visible")
    @Test
            public void test_selenium_assertion()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //TestNg Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotEmpty().isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();

    }

}
