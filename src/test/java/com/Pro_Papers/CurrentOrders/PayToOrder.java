package com.Pro_Papers.CurrentOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class PayToOrder extends WebDriverSettings {
@Test
    public void orderPay () throws Exception {
        LoginPap();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();
        jse.executeScript("scroll(0, 400);");
        TimeUnit.SECONDS.sleep(7);
        String pay = driver.findElementByXPath("//*[@id=\"collapseThree\"]/div/div/button").getText();
        System.out.println(pay);


    }
}
