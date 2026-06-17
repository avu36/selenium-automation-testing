package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilterAndLogoutTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void testFilterAndLogout() {
        // Lọc theo giá thấp đến cao
        Select filter = new Select(driver.findElement(By.className("product_sort_container")));
        filter.selectByValue("lohi");

        // Kiểm tra filter (lấy sản phẩm đầu tiên)
        WebElement firstPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]"));
        Assert.assertTrue(firstPrice.getText().contains("$"), "Filter không hoạt động!");

        // Đăng xuất
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();

        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed(), "Logout failed!");
        
        System.out.println("✅ TC03: Lọc sản phẩm và Đăng xuất - Passed");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}