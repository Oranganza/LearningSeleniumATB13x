package com.tester.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium_08_OptionClasses {

    public static void main(String[] args) {

        //headless mode is used for large number of testcases
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
