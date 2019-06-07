package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lending {

    public static WebElement element = null;

    public static WebElement forgotPassword (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/div[2]/div/div/div[1]/form/div[3]/a"));
        return element;
    }
    public static WebElement mail (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"reset-email\"]"));
        return element;
    }
    public static WebElement resetpassword (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"reset-password\"]/span[1]"));
        return element;
    }
    public static WebElement login (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[2]/div/div[1]/button[2]"));
        return element;
    }

}
