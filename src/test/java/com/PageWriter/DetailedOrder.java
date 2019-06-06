package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedOrder {
    public static WebElement element = null;

    public static WebElement openMessageForm (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div"));
        return element;
    }
    public static WebElement sendMessageForm (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button"));
        return element;
    }
    public static WebElement messageRecipientClient (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/select/option[2]"));
        return element;
    }
    public static WebElement messageRecipientSupport (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/select/option[3]"));
        return element;
    }
    public static WebElement message (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/textarea"));
        return element;
    }
    public static WebElement uploadFile (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/div"));
        return element;
    }
    public static WebElement drop  (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]"));
        return element;
    }
    public static WebElement confirm (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/button"));
        return element;
    }
    public static WebElement fileRecipientClient (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/select/option[2]"));
        return element;
    }
    public static WebElement fileRecipientSupport (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/select/option[3]"));
        return element;
    }
    public static WebElement fileTypeAditiMater (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/select/option[2]"));
        return element;
    }
    public static WebElement downloadFile (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[1]/div[2]/a"));
        return element;
    }

}
