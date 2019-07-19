package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AvailableSearchTest extends WebDriverSettings {
    @Test
    public void Search () throws Exception {
        WritersLogin();
        String order_id = driver.findElementByCssSelector(".writers-available-orders-table > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)").getText();
        AvailableOrders.searchOrder(driver).sendKeys(order_id);
        assertEquals(order_id, driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/a")).getText());
    }
}
