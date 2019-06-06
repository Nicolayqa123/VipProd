package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedOrder {

    public static WebElement element = null;

    public static WebElement endChat (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"endChat\"]"));
        return element;
    }
    public static WebElement addNewFile (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/button"));
        return element;
    }
}
