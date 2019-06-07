package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class ContactUS extends WebDriverSettings {

    public void ContacteusCallback () throws Exception {
        LoginPap();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("scroll(0, 5350);");
        driver.findElement(contacteUsClient).click();
        driver.findElement(contacteUsClientMessage).sendKeys("test");
        driver.findElement(contacteUsClientCallBack);
        assertEquals("Message submitted! We'll contact you soon.", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/div[2]/form/div[5]/span")).getText());
    }

    public void ContacteusEmailUs () throws Exception {
        LoginPap();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[5]/a").click();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/div[2]/form/div[4]/textarea").sendKeys("Test");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/div[2]/form/button[2]").click();
        assertEquals("Message submitted! We'll contact you soon.", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/div[2]/form/div[5]/span")).getText());
    }
}
