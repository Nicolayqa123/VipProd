package com.Pro_Papers.CurrentOrders;

import com.PageClient.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SaveFiles extends WebDriverSettings {
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Test
    public void sf() throws Exception {
        LoginPap();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();
        jse.executeScript("scroll(0, 950);");
        TimeUnit.SECONDS.sleep(7);
        DetailedOrder.addNewFile(driver).click();
        TimeUnit.SECONDS.sleep(2);
        TestFileDrop();
        TimeUnit.SECONDS.sleep(10);
        jse.executeScript("scroll(0, 950);");
        driver.findElementByCssSelector("#collapseFour > div > div.box-white.for-circle-loader > div.box-white > button").click();
        // driver.findElement(aNFUpload).click();
     //   TimeUnit.SECONDS.sleep(10);
     //   assertEquals(" Test.docx", driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[2]/div/div/div[2]/a/button")).getText());
    }
}
