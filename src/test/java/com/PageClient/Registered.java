package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registered {
    public static WebElement element = null;

    public static WebElement nextStep (WebDriver driver){
        element = driver.findElement(By.cssSelector(".btn-lg"));
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
    public static WebElement topic (WebDriver driver){
        element = driver.findElement(By.name("topic"));
        return element;
    }
    public static WebElement number_of_references (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div/div[1]/div/div[5]/div/input"));
        return element;
    }
    public static WebElement paper_details (WebDriver driver){
        element = driver.findElement(By.cssSelector("div.col-lg-12:nth-child(6) > div:nth-child(1) > textarea:nth-child(2)"));
        return element;
    }
    public static WebElement subject (WebDriver driver){
        element = driver.findElement(By.name("subject"));
        return element;
    }
    public static WebElement paper_type (WebDriver driver){
        element = driver.findElement(By.name("paper_type"));
        return element;
    }
    public static WebElement pay (WebDriver driver){
        element = driver.findElement(By.cssSelector(".btn-primary"));
        return element;
    }
    public static WebElement discount (WebDriver driver){
        element = driver.findElement(By.cssSelector("div.col-xl-3:nth-child(2) > div:nth-child(2) > input:nth-child(2)"));
        return element;
    }

}
