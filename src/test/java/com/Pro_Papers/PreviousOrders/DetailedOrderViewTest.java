package com.Pro_Papers.PreviousOrders;

import com.PageClient.Page;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class DetailedOrderViewTest extends WebDriverSettings {
        @Test
        public void DetaileOrder1 () throws Exception {
            LoginPap();
            Page.Previous_Orders(driver).click();
            assertEquals("Previous orders", driver.findElement(By.cssSelector(".content > h3:nth-child(1)")).getText());
        }
}
