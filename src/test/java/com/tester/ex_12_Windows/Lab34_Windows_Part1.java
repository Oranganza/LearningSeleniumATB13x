package com.tester.ex_12_Windows;

import com.tester.ex03_Selenium_Locators.Utiles.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab34_Windows_Part1 extends CommonToAll {

    @Test
    public void test_windows() {
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        System.out.println(driver);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Set<String> windows_handles = driver.getWindowHandles();
        System.out.println(windows_handles);

        //How do I switch to the child window and
        // verify that there is a text with the name of new window

        for (String window: windows_handles)
        {
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window"));
            {
                System.out.println("Test Case Passed!");
            }

            driver.switchTo().window(parent_id);


        }

        driver.quit();


    }

}
