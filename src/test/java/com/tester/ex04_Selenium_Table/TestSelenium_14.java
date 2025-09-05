package com.tester.ex04_Selenium_Table;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_14 {

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int colume = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i = 2;i<=row;i++)
        {
            for (int j = 2;j<=colume;j++)
            {
                String dynamic_path = first_part+i+second_part+j+third_part;
//                System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
            }
        }



    }
}
