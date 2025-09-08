package com.tester.ex_08_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_23_Input_checkbox_RadioButton {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        //Input
        driver.findElement(By.name("firstname")).sendKeys("The Testing Academy");


        //Radio-Button

        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-1")).click();

        //checkBox
        driver.findElement(By.id("profession-1")).click();

        driver.quit();
    }
}
