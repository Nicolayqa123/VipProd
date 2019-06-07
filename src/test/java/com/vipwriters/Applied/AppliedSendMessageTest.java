package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;

import org.assertj.core.api.Fail;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedSendMessageTest extends WebDriverSettings {
    @Test
    public void sendMessage() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.order10354(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("Test Client");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }

    @Test
    public void sendMessageMin() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.order10354(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("Test");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }

    @Test
    public void sendMessageMax() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.order10354(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("Test ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest Client");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }

    @Test
    public void SendMessageToClientEmptyField() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.order10354(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("");
        DetailedOrder.sendMessageForm(driver).click();
        
    }
}
  //  Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).equals(true));






