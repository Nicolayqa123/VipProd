package com.Pro_Papers.PreviousOrders;

import com.PageClient.Page;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PayToOrderTest extends WebDriverSettings {
    @Test
    public void orderPay () throws Exception {
        LoginPap();
        Page.Previous_Orders(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
        driver.findElement(By.cssSelector("tr.odd:nth-child(1) > td:nth-child(1) > a:nth-child(2)")).click();
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElementByCssSelector("table.table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > form:nth-child(1) > button:nth-child(2)").click();
        TimeUnit.SECONDS.sleep(10);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        assertEquals("Website address:\n" +"pro-papers.com", driver.findElement(By.cssSelector("div.row:nth-child(1)")).getText());
     //   assertTrue( driver.findElement(By.cssSelector("div.row:nth-child(1) > div:nth-child(2)")).getText().contains("test"));


        /* String pay = driver.findElementByXPath("//*[@id=\"collapseThree\"]/div/div/button").getText();
        System.out.println(pay);*/
    }
}
