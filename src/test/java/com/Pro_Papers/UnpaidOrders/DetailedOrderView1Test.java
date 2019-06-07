package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class DetailedOrderView1Test extends WebDriverSettings {



    @Test
    public void DetaileOrder1 () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 4350);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        jse.executeScript("scroll(0, 1050);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").click();

        assertEquals("Deadline:", driver.findElement(By.cssSelector(".dedline")).getText());
    }
}
