package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PayToOrder extends WebDriverSettings {
    @Test
    public void orderPay () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 4350);");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        jse.executeScript("scroll(0, 1050);");
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[2]/td[1]/a").click();
        jse.executeScript("scroll(0, 1450);");
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"collapseThree\"]/div/div/button").click();

    }
}
