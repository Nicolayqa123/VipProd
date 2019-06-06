package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationNeeded {
    public static WebElement element = null;


    public static WebElement order10292(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/a"));
        return element;
    }
    public static WebElement filterOrderId(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/thead/tr/th[1]/p"));
        return element;
    }
    public static WebElement filterPrice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/thead/tr/th[2]/p"));
        return element;
    }
    public static WebElement confirmationNeeded(WebDriver driver){
        element = driver.findElement(By.id("writers-confirmation-needed-amount"));
        return element;
    }
}
