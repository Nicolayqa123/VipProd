package com.vipwriters.Applied;

import com.PageWriter.AppliedOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;

import org.assertj.core.api.Fail;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedSendMessage extends WebDriverSettings {
    @Test
    public void sendMessage() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.orderApplied(driver).click();
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
        AppliedOrders.orderApplied(driver).click();
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
        TimeUnit.SECONDS.sleep(1);
        AppliedOrders.orderApplied(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 650);");
        DetailedOrder.message(driver).sendKeys("Dear Writer,\n" +
                "\n" +
                "Based on the proposal you have provided me earlier, i would say the first two topics would go.\n" +
                "But i'm confused here the research topics from 3 to 6 are more concentrating on the purchasing side( which is very good to be precise) , my doubt is if i select those  research topics would the research question change. \n" +
                "Because I've already submitted the proposal in school and based on that we have to finish the final project where first two topics are more apt.\n" +
                "I've provided the feedback of the proposal given by my professor.\n" +
                "Let me know your thoughts.\n" +
                "Thank you.\n");
        DetailedOrder.sendMessageForm(driver).click();
        TimeUnit.SECONDS.sleep(1);
        assertEquals("Message successfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }

    @Test
    public void SendMessageToClientEmptyField() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
        AppliedOrders.appliedOrders(driver).click();
        AppliedOrders.orderApplied(driver).click();
        DetailedOrder.openMessageForm(driver).click();
        DetailedOrder.messageRecipientClient(driver).click();
        DetailedOrder.message(driver).sendKeys("");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        DetailedOrder.sendMessageForm(driver).click();
        
    }
}
  //  Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).equals(true));






