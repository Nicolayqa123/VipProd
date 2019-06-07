package com.Pro_Papers.PreviousOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class SaveFilesTest extends WebDriverSettings {
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Test
    public void sf() throws Exception {
        LoginPap();

        driver.findElement(previousOrders).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
        driver.findElement(order10272).click();
        TimeUnit.SECONDS.sleep(2);
        jse.executeScript("scroll(0, 950);");
        TimeUnit.SECONDS.sleep(7);
        driver.findElement(addNewFile).click();
        TimeUnit.SECONDS.sleep(2);
        TestFileDrop();
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(aNFUpload).click();
        TimeUnit.SECONDS.sleep(10);
    }
}
