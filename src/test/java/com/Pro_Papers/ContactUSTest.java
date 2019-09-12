package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ContactUSTest extends WebDriverSettings {
    @Test
    public void ContacteUsMail () throws Exception {
        driver.get(ProPapers_ProdUrl + "/contact");
        driver.findElementById("user-email").sendKeys(mailPro);
        driver.findElementById("message").sendKeys("test");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 450);");
        driver.findElementById("e-mail-us").click();
        assertEquals("Success!\n" +
                "Message submitted! We'll contact you soon.", driver.findElement(By.id("toast-container")).getText());
    }

    @Test
    public void ContacteUsNoValidMail () throws Exception {
        driver.get(ProPapers_ProdUrl +  "/contact");
        driver.findElementById("user-email").sendKeys("nicolay@@gmai.com");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 450);");
        driver.findElementById("e-mail-us").click();
        assertEquals("Email is required", driver.findElement(By.cssSelector("div.col-lg-6:nth-child(4) > p:nth-child(2)")).getText());
        assertEquals("Message is required", driver.findElement(By.cssSelector("div.col-lg-12:nth-child(5) > p:nth-child(2)")).getText());

    }
}
