package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AddChangeDiscountTest extends WebDriverSettings {
@Test
    public void discountFalse() throws Exception {
    LoginPap();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("scroll(0, 4350);");
    driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
    jse.executeScript("scroll(0, 1050);");
    driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").click();
    driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/button").click();
    driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/form/div/div[2]/input").sendKeys("test");
    driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/form/div/button").click();
    TimeUnit.SECONDS.sleep(2);
    assertEquals("Discount not found", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/form/div/p")).getText());


    }


}
