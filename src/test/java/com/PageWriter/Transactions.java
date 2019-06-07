package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Transactions {
    public static WebElement element = null;



    public static WebElement transactions (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/ul/li[6]/a"));
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

    public static WebElement reasonEarn(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/select/option[2]"));
        return element;
    }

    public static WebElement reasonCancell(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/select/option[4]"));
        return element;
    }
    public static WebElement search(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[3]/input"));
        return element;
    }
}
