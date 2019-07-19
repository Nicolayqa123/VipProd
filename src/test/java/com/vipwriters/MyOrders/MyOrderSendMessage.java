package com.vipwriters.MyOrders;


import com.PageWriter.DetailedOrder;
import com.PageWriter.MyOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrderSendMessage extends WebDriverSettings {
    @Test
    public void SendMessageToClient1 () throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        MyOrders.myOrders(driver).click();
        MyOrders.OrderInProgress(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("Test message");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());


    }
    @Test
    public void SendMessageToClientMax() throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        MyOrders.myOrders(driver).click();
        MyOrders.OrderInProgress(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 650);");
        DetailedOrder.message(driver).sendKeys("Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message Test message ");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void SendMessageToClientMin() throws Exception {

//        WritersLogin();
        WritersLogin();

        TimeUnit.SECONDS.sleep(4);
        MyOrders.myOrders(driver).click();
        MyOrders.OrderInProgress(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("Test");
        DetailedOrder.sendMessageForm(driver).click();
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }

}
