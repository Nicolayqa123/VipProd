package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrders {
    public static WebElement element = null;



    public static WebElement filterOrderId(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/thead/tr/th[1]/p"));
        return element;
    }
    public static WebElement filterPrice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/thead/tr/th[2]/p"));
        return element;
    }
    public static WebElement myOrders(WebDriver driver){
        element = driver.findElement(By.id("writers-my-orders-amount"));
        return element;
    }
    public static WebElement Order10015(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/a"));
        return element;
    }
}
