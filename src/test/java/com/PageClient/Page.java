package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    public static WebElement element = null;

    public static WebElement Current_Orders (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(1)"));
        return element;
    }
    public static WebElement Unpaid_Orders (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(2)"));
        return element;
    }
    public static WebElement Previous_Orders (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(3)"));
        return element;
    }
    public static WebElement Profile (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(4)"));
        return element;
    }
    public static WebElement Verificaion (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(5)"));
        return element;
    }
    public static WebElement Referral_program (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(6)"));
        return element;
    }
    public static WebElement Credits (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(7)"));
        return element;
    }
    public static WebElement Contacte_Us (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.profile-link:nth-child(8)"));
        return element;
    }
}
