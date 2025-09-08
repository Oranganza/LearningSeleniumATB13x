package com.tester.ex_08_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_26_Modal {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
    }
}
