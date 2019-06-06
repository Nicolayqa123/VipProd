package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AvailableSearchTest extends WebDriverSettings {

    public void Search () throws Exception {
        WritersLogin();
        AvailableOrders.searchOrder(driver).sendKeys("10004");
        assertEquals("10004", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/a")).getText());
    }
}
