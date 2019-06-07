package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppliedOrders {
    public static WebElement element = null;



    public static WebElement filterOrderId(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[1]/p"));
        return element;
    }
    public static WebElement filterPrice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[2]/p"));
        return element;
    }
    public static WebElement appliedOrders(WebDriver driver){
        element = driver.findElement(By.id("writers-applied-orders-amount"));
        return element;
    }
    public static WebElement orderApplied(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr/td[1]/a"));
        return element;
    }
}
