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
}
