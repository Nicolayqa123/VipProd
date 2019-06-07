package Regression;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Available extends WebDriverSettings {

    private By login1 = By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a");
    private By username1 = By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input");
    private By passworf1 = By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input");
    private By loginButton1 = By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input");




    @Test
    public void AllInA() throws Exception {
        driver.get("https://writer.urgentpapers.org");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(login1).click();
        driver.findElement(username1).sendKeys("Nicolayqa@gmail.com");
        driver.findElement(passworf1).sendKeys("nicolayqa");
        driver.findElement(loginButton1).click();
        TimeUnit.SECONDS.sleep(8);
        Select dropdown = new Select(driver.findElement(By.name("availableOrders_length")));
        dropdown.selectByValue("10");
        TimeUnit.SECONDS.sleep(2);
        dropdown.selectByValue("-1");
        TimeUnit.SECONDS.sleep(2);
        dropdown.selectByValue("25");
    }
    @Test
    public void showeEntriesOnPage() throws InterruptedException {
        driver.get("https://writer.urgentpapers.org");
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(login1).click();
        driver.findElement(username1).sendKeys("Nicolayqa@gmail.com");
        driver.findElement(passworf1).sendKeys("nicolayqa");
        driver.findElement(loginButton1).click();
        TimeUnit.SECONDS.sleep(8);
        Select dropdown = new Select(driver.findElement(By.name("availableOrders_length")));
        dropdown.selectByValue("10");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(8);
        driver.findElementByXPath("//*[@id=\"availableOrders_paginate\"]/ul/li[3]").click();
        TimeUnit.SECONDS.sleep(8);
        jse.executeScript("scroll(0, 250);");
        assertEquals("Showing 11 to 20 of 42 entries", driver.findElement(By.id("availableOrders_info")).getText());



    }




}
