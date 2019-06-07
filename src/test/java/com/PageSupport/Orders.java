package com.PageSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orders {
    public static WebElement element = null;


    public static WebElement search(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"orders_filter\"]/label/input"));
        return element;
    }
    public static WebElement searchButton(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button"));
        return element;
    }
    public static WebElement entries10(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"orders_length\"]/label/select/option[1]"));
        return element;
    }
    public static WebElement entries25(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"orders_length\"]/label/select/option[2]"));
        return element;
    }
    public static WebElement order (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]"));
        return element;
    }
    
}
