package com.PageSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderStatus {
    public static WebElement element = null;


    public static WebElement statusDispute(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]"));
        return element;
    }
    public static WebElement statusFraude(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[2]"));
        return element;
    }
    public static WebElement statusCancelled(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[3]"));
        return element;
    }
    public static WebElement statusCasePublished(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[4]"));
        return element;
    }
    public static WebElement statusClarificationPending(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[5]"));
        return element;
    }
    public static WebElement statusDone(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[6]"));
        return element;
    }





}




