package com.support;

import com.PageClient.Page;
import com.PageSupport.HintBox;
import com.PageSupport.OrderStatus;
import com.PageWriter.AvailableOrders;
import com.PageWriter.ConfirmationNeeded;
import com.PageWriter.DetailedOrder;
import com.PageWriter.Transactions;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class CheckStepsOfSupportTest extends WebDriverSettings {



    @Test
    public void stepsSupport() throws Exception {


        LoginNewInquiry();
        TimeUnit.SECONDS.sleep(15);
        String number = driver.findElementByCssSelector(".order-h3 > span:nth-child(1)").getText();
        System.out.println(number);
        driver.manage().window().maximize();

        //  String number = "46913";
        System.out.println(number);



        SupportLogin();
        driver.get("https://adminpanel.urgentpapers.org/orders/" + number);
        HintBox.inquiry(driver).click();
        TimeUnit.SECONDS.sleep(3);
        HintBox.search(driver).sendKeys(number);
        driver.findElementByCssSelector(".animate-scroll-up").click();
        TimeUnit.SECONDS.sleep(10);
//        assertEquals("Injuiry processing", driver.findElement(By.cssSelector("select.push-5")).getText());
        Select status = new Select(driver.findElement(By.cssSelector("select.push-5")));
        TimeUnit.SECONDS.sleep(10);
        status.selectByValue("6"); // WFP
        OrderStatus.reason(driver).sendKeys("test test test");
        OrderStatus.ok(driver).click();
        TimeUnit.SECONDS.sleep(12);
        status.selectByValue("7"); // Paid
        OrderStatus.reason(driver).sendKeys("test test test");
        OrderStatus.ok(driver).click();
        TimeUnit.SECONDS.sleep(12);
        status.selectByValue("8"); // Case Published
        OrderStatus.reason(driver).sendKeys("test test test");
        OrderStatus.ok(driver).click();
        //  assertEquals("Inquiry published", driver.findElement(By.cssSelector(".dropdown-toggle")).getText());

        WritersLogin();
        AvailableOrders.searchOrder(driver).sendKeys(number);
        driver.findElementByCssSelector(".writers-available-orders-table > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").click();
        driver.findElementByCssSelector(".writers-order-apply-message > textarea:nth-child(2)").sendKeys("test test ");
        driver.findElementByCssSelector(".writers-order-apply-message > button:nth-child(3)").click();
        assertEquals("You applied", driver.findElement(By.id("swal2-title")).getText());

        TimeUnit.SECONDS.sleep(2);

        driver.get("https://adminpanel.urgentpapers.org/orders/" + number);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 2050);");
        TimeUnit.SECONDS.sleep(8);


        driver.findElementByCssSelector("#order-table-app > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(3) > button:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElementByCssSelector("div.modal:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)").click();

        driver.get("https://vip-writers.com/panel/orders-available");
        TimeUnit.SECONDS.sleep(5);
        ConfirmationNeeded.confirmationNeeded(driver).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByCssSelector("div.writers-available-orders-table:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(2);
        DetailedOrder.confirm(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("You confirmed the order", driver.findElement(By.id("swal2-title")).getText());
        driver.findElementByCssSelector(".swal2-confirm").click();
        DetailedOrder.uploadFile(driver).click();
        DetailedOrder.fileRecipientClient(driver).click();
        DetailedOrder.fileTypeFinal(driver).click();
        DetailedOrder.drop(driver).click();
        TestFileDrop();
        //   JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(2);
        DetailedOrder.confirmFile(driver).click();
        assertEquals("The file was successfully uploaded.", driver.findElement(By.id("swal2-title")).getText());


        driver.get("https://adminpanel.urgentpapers.org/orders/" + number);

        TimeUnit.SECONDS.sleep(15);
        //   JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 2750);");
        driver.findElementByXPath("/html/body/div[1]/div/div/div/main/div/div[2]/div[2]/div[6]/div[2]/div[2]/div/div[2]/div[1]/button[1]").click();
        TimeUnit.SECONDS.sleep(10);
        assertEquals("I changed the order status to 'Delivered'", driver.findElement(By.cssSelector("p.left-notes-message-text:nth-child(4)")).getText());

        driver.get("https://pro-papers.com/my/orders");
        Page.Previous_Orders(driver).click();
        driver.findElementByCssSelector("input.form-control:nth-child(1)").sendKeys(number);
        driver.findElementByCssSelector(".order-table-link").click();
        assertEquals("final", driver.findElement(By.cssSelector(".badge")).getText());

        driver.get("https://vip-writers.com/panel/orders-available");
        TimeUnit.SECONDS.sleep(3);
        Transactions.transactions(driver).click();
        Transactions.search(driver).sendKeys(number);
        assertEquals("Earn", driver.findElement(By.cssSelector(".writers-transactions-table > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)")).getText());



    }




// driver.switchTo().alert().accept();




}
