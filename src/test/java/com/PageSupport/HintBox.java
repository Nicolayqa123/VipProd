package com.PageSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HintBox {
    public static WebElement element = null;


    public static WebElement inquiry(WebDriver driver){
        element = driver.findElement(By.cssSelector("div.hints-table-wrapper:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)"));
        return element;
    }
    public static WebElement search(WebDriver driver){
        element = driver.findElement(By.id("search-field"));
        return element;
    }
}
