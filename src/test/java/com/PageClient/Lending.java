package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lending {

    public static WebElement element = null;

    public static WebElement forgotPassword (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[3]/div[2]/button"));
        return element;
    }
    public static WebElement mail (WebDriver driver){
        element = driver.findElement(By.id("email-reset"));
        return element;
    }
    public static WebElement resetpassword (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[3]/div[1]/button"));
        return element;
    }
    public static WebElement login (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/button"));
        return element;
    }
    public static WebElement Order_Now (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.btn-default:nth-child(1)"));
        return element;
    }
    public static WebElement Free_Inquiry (WebDriver driver){
        element = driver.findElement(By.cssSelector("a.btn:nth-child(4)"));
        return element;
    }

}
