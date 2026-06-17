package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLoginSuccess() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement productPage = driver.findElement(By.className("title"));
        Assert.assertTrue(productPage.isDisplayed(), "Login failed!");
        Assert.assertEquals(productPage.getText(), "Products");
        
        System.out.println("✅ TC01: Đăng nhập thành công - Passed");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) driver.quit();
    }
}
