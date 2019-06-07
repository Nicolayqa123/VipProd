package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailUs {
    public static WebElement element = null;



    public static WebElement message (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/textarea"));
        return element;
    }
    public static WebElement sendMessage (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/button/span[1]"));
        return element;
    }
    public static WebElement subjectQuestion (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/select/option[2]"));
        return element;
    }
    public static WebElement subjectOther (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[1]/select/option[5]"));
        return element;
    }
    public static WebElement customSubject (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[2]/input"));
        return element;
    }
    public static WebElement mailUs (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/ul/li[9]/a"));
        return element;
    }
}
