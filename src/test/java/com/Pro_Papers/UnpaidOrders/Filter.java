package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Filter extends WebDriverSettings {
    @Test
    public void Filter1 () throws Exception {
        LoginPap();

        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
        String order1 = driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").getText();

        driver.findElementByCssSelector("th.case").click();
        String order2 = driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/a").getText();

        assertTrue(order1 != order2);
    }
}
