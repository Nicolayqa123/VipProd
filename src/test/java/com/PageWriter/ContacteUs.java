package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContacteUs {
    public static WebElement element = null;

    public static WebElement subjectOther(WebDriver driver){
        element = driver.findElement(By.name("subjectOther"));
        return element;
    }
    public static WebElement senderEmail(WebDriver driver){
        element = driver.findElement(By.name("senderEmail"));
        return element;
    }
    public static WebElement name(WebDriver driver){
        element = driver.findElement(By.name("senderName"));
        return element;
    }
    public static WebElement phone(WebDriver driver){
        element = driver.findElement(By.id("senderPhone"));
        return element;
    }
    public static WebElement messageText(WebDriver driver){
        element = driver.findElement(By.name("messageText"));
        return element;
    }
    public static WebElement send(WebDriver driver){
        element = driver.findElement(By.id("submit-contact-us-button"));
        return element;
    }
}
