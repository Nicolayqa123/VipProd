package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvailableOrders {

    public static WebElement element = null;

    public static WebElement searchOrder(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[3]/input"));
        return element;
    }

    public static WebElement showOnlyMy(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
        return element;
    }
    public static WebElement orderAvailable(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr/td[1]/a"));
        return element;
    }
    public static WebElement filterorderId(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/thead/tr/th[1]"));
        return element;
    }
    public static WebElement filterprice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/thead/tr/th[2]/p"));
        return element;
    }
    public static WebElement availableOrder(WebDriver driver){
        element = driver.findElement(By.id("writers-available-orders-amount"));
        return element;
    }
    public static WebElement showEntries10(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/select/option[2]"));
        return element;
    }
    public static WebElement showEntries25(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/select/option[3]"));
        return element;
    }
    public static WebElement page2(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/ul/li[3]"));
        return element;
    }
    public static WebElement page3(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/ul/li[4]"));
        return element;
    }

}
