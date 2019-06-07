package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

        WebElement unpaidOrders = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a/span"));

        unpaidOrders.click();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[1]/a").click();
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div[1]/div/button").click();
        setClipboardData("C:\\Test.docx");
//native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div[1]/div/button").click();
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(" Test.docx", driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[2]/div/div/div[2]/a/button")).getText());
    }
}
