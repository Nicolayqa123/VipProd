package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_Sign_Up {
    public static WebElement element = null;

    public static WebElement Mail_Order (WebDriver driver){
        element = driver.findElement(By.id("e-mail"));
        return element;
    }
    public static WebElement Password_Order (WebDriver driver){
        element = driver.findElement(By.name("password"));
        return element;
    }
    public static WebElement Phone_Order (WebDriver driver){
        element = driver.findElement(By.cssSelector(".intl-tel-input > input:nth-child(2)"));
        return element;
    }
    public static WebElement TermsOU_Order (WebDriver driver){
        element = driver.findElement(By.cssSelector(".mt-3 > label:nth-child(2)"));
        return element;
    }
    public static WebElement Pay_Order (WebDriver driver){
        element = driver.findElement(By.cssSelector("button.float-right"));
        return element;
    }
    public static WebElement Facebook_Order (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.btn:nth-child(3)"));
        return element;
    }
    public static WebElement Login_Order (WebDriver driver){
        element = driver.findElement(By.cssSelector("button.btn:nth-child(3)"));
        return element;
    }
}
