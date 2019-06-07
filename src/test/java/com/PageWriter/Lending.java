package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lending {

    public static WebElement element = null;

    public static WebElement loginForm (WebDriver driver){
        element = driver.findElement(By.id("sign-in-button"));
        return element;
    }
    public static WebElement userName (WebDriver driver){
        element = driver.findElement(By.id("username"));
        return element;
    }
    public static WebElement password (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        return element;
    }
    public static WebElement loginButton (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[4]/input"));
        return element;
    }
    public static WebElement forgotPassword (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[5]/a"));
        return element;
    }
    public static WebElement forgotPasswordMail (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmailForm\"]/div[2]/div[1]/div/input"));
        return element;
    }
    public static WebElement forgotPasswordSend (WebDriver driver){
        element = driver.findElement(By.id("sendForgotPasswordEmail"));
        return element;
    }



}
