package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableSendMessageInOrderTest extends WebDriverSettings {

    @Test
    public void SendMessageToClient() throws Exception {

        WritersLogin();
        AvailableOrders.order10004(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("Test Client");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
        @Test
        public void SendMessageToClientMax() throws Exception {

            WritersLogin();
            AvailableOrders.order10004(driver).click();
            DetailedOrder.openMessageForm(driver).click();
            DetailedOrder.messageRecipientClient(driver).click();
            DetailedOrder.message(driver).sendKeys("Test ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest ClientTest Client");
            DetailedOrder.sendMessageForm(driver).click();
            assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

        }
    @Test
    public void SendMessageToClientMin() throws Exception {

        WritersLogin();
        AvailableOrders.order10004(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("T");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }

    }

