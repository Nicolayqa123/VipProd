package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile {
    public static WebElement element = null;

    public static WebElement Phone (WebDriver driver){
        element = driver.findElement(By.cssSelector(".react-tel-input > input:nth-child(1)"));
        return element;
    }
    public static WebElement FirstName (WebDriver driver){
        element = driver.findElement(By.name("firstName"));
        return element;
    }
    public static WebElement LastName (WebDriver driver){
        element = driver.findElement(By.name("lastName"));
        return element;
    }
    public static WebElement Email (WebDriver driver){
        element = driver.findElement(By.name("email"));
        return element;
    }
    public static WebElement AltPhone (WebDriver driver){
        element = driver.findElement(By.name("altPhone"));
        return element;
    }
    public static WebElement Change_password (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.btn-primary:nth-child(1)"));
        return element;
    }
    public static WebElement Verification (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.btn-primary:nth-child(2)"));
        return element;
    }
    public static WebElement Current_password (WebDriver driver){
        element = driver.findElement(By.name("current"));
        return element;
    }
    public static WebElement New_password (WebDriver driver){
        element = driver.findElement(By.name("new"));
        return element;
    }
    public static WebElement Repeat_password (WebDriver driver){
        element = driver.findElement(By.name("repeat"));
        return element;
    }
    public static WebElement Button_change_password (WebDriver driver){
        element = driver.findElement(By.cssSelector("button.btn"));
        return element;
    }
    public static WebElement Button_save_changes (WebDriver driver){
        element = driver.findElement(By.cssSelector("button.btn:nth-child(1)"));
        return element;
    }
}
