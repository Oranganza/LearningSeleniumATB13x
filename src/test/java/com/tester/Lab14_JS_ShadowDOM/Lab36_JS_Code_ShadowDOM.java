package com.tester.Lab14_JS_ShadowDOM;

import com.tester.ex03_Selenium_Locators.Utiles.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.tester.ex_09_WaitHelper.waitHelpers.waitJVM;

public class Lab36_JS_Code_ShadowDOM extends CommonToAll {

    @Test
    public void test_js() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitJVM(3000);

//        driver.findElement(By.id("pizza")).sendKeys("farmhouse");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputboxPizza.sendKeys("farmhouse");

        closeBrowser(driver);

    }
}

