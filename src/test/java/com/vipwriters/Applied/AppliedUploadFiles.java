package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedUploadFiles extends WebDriverSettings {
@Test
    public void download () throws Exception {
    WritersLogin();
    TimeUnit.SECONDS.sleep(4);
    AppliedOrders.appliedOrders(driver).click();
    AppliedOrders.orderApplied(driver).click();
    TimeUnit.SECONDS.sleep(2);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("scroll(0, 650);");
    DetailedOrder.uploadFile(driver).click();
    DetailedOrder.fileRecipientClient(driver).click();
    DetailedOrder.fileTypeAditiMater(driver).click();
    DetailedOrder.drop(driver).click();
    TestFileDrop();
    DetailedOrder.confirm(driver).click();
   // TimeUnit.SECONDS.sleep(10);
  //  driver.findElementById("2210").click();
   // driver.findElementByXPath("/html/body/div[2]/div/div[3]/button[1]").click();
  //  TimeUnit.SECONDS.sleep(10);
   // assertEquals("File successfully upload!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());


    }
    }

   // clean install