package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;

public class AvailableFilterTest extends WebDriverSettings {

    @Test
    public void Filter () throws Exception{
        WritersLogin();
        TimeUnit.SECONDS.sleep(6);
       String getOrderId = driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]").getText();
        AvailableOrders.filterorderId(driver).click();
        AvailableOrders.filterorderId(driver).click();
        assertFalse(getOrderId != getOrderId);
        String getOrderPrice = driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]").getText();

        AvailableOrders.filterprice(driver).click();
        assertFalse(getOrderPrice != getOrderPrice);

      //  assertEquals("1057.03", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]")).getText());
    }




}
