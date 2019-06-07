package com.Pro_Papers.PreviousOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class DetailedOrderView1 extends WebDriverSettings {
        @Test
        public void DetaileOrder1 () throws Exception {
            LoginPap();
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0, 4350);");
            driver.findElement(previousOrders).click();
            jse.executeScript("scroll(0, 1050);");
            driver.findElement(order10272).click();

            assertEquals("Deadline:", driver.findElement(By.cssSelector(".dedline")).getText());
        }
}
