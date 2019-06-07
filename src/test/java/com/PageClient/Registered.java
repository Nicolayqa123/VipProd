package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registered {
    public static WebElement element = null;

    public static WebElement onStep2 (WebDriver driver){
        element = driver.findElement(By.id("go_to_step2_button"));
        return element;
    }
    public static WebElement FirstName (WebDriver driver){
        element = driver.findElement(By.id("sign-up-first-name"));
        return element;
    }
    public static WebElement LastName (WebDriver driver){
        element = driver.findElement(By.id("order-input-2"));
        return element;
    }
    public static WebElement EMailAddress (WebDriver driver){
        element = driver.findElement(By.id("sign-up-email"));
        return element;
    }
    public static WebElement Password (WebDriver driver){
        element = driver.findElement(By.id("order-input-4"));
        return element;
    }
    public static WebElement CellPhone (WebDriver driver){
        element = driver.findElement(By.id("go_to_step2_button"));
        return element;
    }
}
