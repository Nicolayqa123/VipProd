package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class ContactUSTest extends WebDriverSettings {
@Test
    public void ContacteusCallback () throws Exception {
        LoginPap();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("scroll(0, 1350);");
        driver.findElement(contacteUsClient).click();
        driver.findElement(contacteUsClientMessage).sendKeys("test");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[2]/div[2]/form/button[2]").click();
     //   assertEquals("Message submitted! We'll contact you soon.", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/div[2]/form/div[5]/span")).getText());
    }
@Test
    public void ContacteusEmailUs () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1350);");
        driver.findElement(contacteUsClient).click();
        driver.findElement(contacteUsClientMessage).sendKeys("test");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[2]/div[2]/form/button[1]").click();
        //  assertEquals("Message submitted! We'll contact you soon.", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/div[2]/form/div[5]/span")).getText());
    }
}
