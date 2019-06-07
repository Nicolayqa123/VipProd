package com.vipwriters.available;


import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableShowOnlyOrdersWithinMyProficiencyTest extends WebDriverSettings {

    @Test
    public void OrderWithMy () throws Exception {

        WritersLogin();
        AvailableOrders.showOnlyMy(driver).click();
        AvailableOrders.searchOrder(driver).sendKeys("10044");
        assertEquals("10044", driver.findElement(By.cssSelector("#root > div > div > div.writers-content > div:nth-child(2) > div.writers-available-orders-table > table > tbody > tr > td:nth-child(1) > a")).getText());

    }
}
