package com.support;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MorePayments extends WebDriverSettings {


    public void WritersLoginCom() {
        driver.get("http://writer.vip-writers.commentality.com");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement login = driver.findElement(By.xpath("/html/body/div/header/div/div[2]/nav/ul/li[11]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        username.sendKeys("gennadii2@test.com");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        password.sendKeys("123456");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void MP() throws Exception {

        RegisteredStep3Inquiry();
        driver.manage().window().maximize();
        driver.get("https://support.vip-writers.commentality.com/signIn");
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div/div[3]/input"));
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/button"));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        login.sendKeys("support@test.com");
        password.sendKeys("Password1");
        signIn.click();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement filterID = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/thead/tr/th[1]"));



        filterID.click();
        String number = driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();

        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
            TimeUnit.SECONDS.sleep(5);

        driver.findElementByCssSelector(".order-details-actions > div:nth-child(1)").click();
        driver.findElementByCssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("asdasdassadsadasdasdasdasdsadsadsadsadsadsadsadsa");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
            TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
            TimeUnit.SECONDS.sleep(6);

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a").click();
            TimeUnit.SECONDS.sleep(4);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[2]/div/input").sendKeys("666");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test test");
        driver.findElementByCssSelector("input.btn").click();
            TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

            TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry%20applied");

            TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/a").click();

            TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Waiting for paymenttest");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

            TimeUnit.SECONDS.sleep(10);
        WritersLoginCom();

            TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

            TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/WFP");

            TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();

            TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Paid test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

            TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
            TimeUnit.SECONDS.sleep(5);


        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Paid");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Case published test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Case published", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());



/*        WritersLogin();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]")).equals(number));
*/

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Case%20published");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div/table/tbody/tr[2]/td[3]/button").click();
        driver.switchTo().alert().accept();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/div[1]/div/div[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());

        driver.get("https://support.vip-writers.commentality.com/orders");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"upload-button\"]/span").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        jse.executeScript("scroll(0, 500);");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"fileUploadDropzone\"]").click();
        setClipboardData("C:\\Test.docx");
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
            TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"fileSubmitButton\"]").click();
            TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-500);");
            TimeUnit.SECONDS.sleep(2);

        driver.get("https://support.vip-writers.commentality.com/orders");
            TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
            TimeUnit.SECONDS.sleep(3);
        assertEquals("Done", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());
        jse.executeScript("scroll(0,1500);");
            TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[6]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/a").click();
            TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-1500);");
            TimeUnit.SECONDS.sleep(3);

    }

    @Test
    public void MP1 () throws Exception {

        RegisteredStep3Inquiry();
        driver.manage().window().maximize();
        driver.get("https://support.vip-writers.commentality.com/signIn");
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div/div[3]/input"));
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/button"));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        login.sendKeys("support@test.com");
        password.sendKeys("Password1");
        signIn.click();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement filterID = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/thead/tr/th[1]"));



        filterID.click();
        String number = driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();

        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(5);

        driver.findElementByCssSelector(".order-details-actions > div:nth-child(1)").click();
        driver.findElementByCssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("asdasdassadsadasdasdasdasdsadsadsadsadsadsadsadsa");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
        TimeUnit.SECONDS.sleep(6);

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(4);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[2]/div/input").sendKeys("666");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test test");
        driver.findElementByCssSelector("input.btn").click();
        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry%20applied");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Waiting for paymenttest");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);
        WritersLoginCom();

        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/WFP");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Paid test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        TimeUnit.SECONDS.sleep(5);


        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Paid");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Case published test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Case published", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());



/*        WritersLogin();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]")).equals(number));
*/

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Case%20published");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div/table/tbody/tr[2]/td[3]/button").click();
        driver.switchTo().alert().accept();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/div[1]/div/div[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());

        driver.get("https://support.vip-writers.commentality.com/orders");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"upload-button\"]/span").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        jse.executeScript("scroll(0, 500);");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"fileUploadDropzone\"]").click();
        setClipboardData("C:\\Test.docx");
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
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"fileSubmitButton\"]").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-500);");
        TimeUnit.SECONDS.sleep(2);

        driver.get("https://support.vip-writers.commentality.com/orders");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Done", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());
        jse.executeScript("scroll(0,1500);");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[6]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/a").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-1500);");
        TimeUnit.SECONDS.sleep(3);

    }

    @Test
    public void MP2 () throws Exception {

        RegisteredStep3Inquiry();
        driver.manage().window().maximize();
        driver.get("https://support.vip-writers.commentality.com/signIn");
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div/div[3]/input"));
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/button"));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        login.sendKeys("support@test.com");
        password.sendKeys("Password1");
        signIn.click();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement filterID = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/thead/tr/th[1]"));



        filterID.click();
        String number = driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();

        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(5);

        driver.findElementByCssSelector(".order-details-actions > div:nth-child(1)").click();
        driver.findElementByCssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("asdasdassadsadasdasdasdasdsadsadsadsadsadsadsadsa");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
        TimeUnit.SECONDS.sleep(6);

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(4);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[2]/div/input").sendKeys("666");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test test");
        driver.findElementByCssSelector("input.btn").click();
        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry%20applied");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Waiting for paymenttest");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);
        WritersLoginCom();

        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/WFP");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Paid test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        TimeUnit.SECONDS.sleep(5);


        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Paid");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Case published test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Case published", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());



/*        WritersLogin();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]")).equals(number));
*/

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Case%20published");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div/table/tbody/tr[2]/td[3]/button").click();
        driver.switchTo().alert().accept();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/div[1]/div/div[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());

        driver.get("https://support.vip-writers.commentality.com/orders");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"upload-button\"]/span").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        jse.executeScript("scroll(0, 500);");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"fileUploadDropzone\"]").click();
        setClipboardData("C:\\Test.docx");
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
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"fileSubmitButton\"]").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-500);");
        TimeUnit.SECONDS.sleep(2);

        driver.get("https://support.vip-writers.commentality.com/orders");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Done", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());
        jse.executeScript("scroll(0,1500);");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[6]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/a").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-1500);");
        TimeUnit.SECONDS.sleep(3);

    }
    @Test
    public void MP3 () throws Exception {

        RegisteredStep3Inquiry();
        driver.manage().window().maximize();
        driver.get("https://support.vip-writers.commentality.com/signIn");
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div/div[3]/input"));
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/button"));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        login.sendKeys("support@test.com");
        password.sendKeys("Password1");
        signIn.click();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement filterID = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/thead/tr/th[1]"));



        filterID.click();
        String number = driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();

        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(5);

        driver.findElementByCssSelector(".order-details-actions > div:nth-child(1)").click();
        driver.findElementByCssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("asdasdassadsadasdasdasdasdsadsadsadsadsadsadsadsa");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
        TimeUnit.SECONDS.sleep(6);

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(4);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[2]/div/input").sendKeys("666");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test test");
        driver.findElementByCssSelector("input.btn").click();
        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry%20applied");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Waiting for paymenttest");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);
        WritersLoginCom();

        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/WFP");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Paid test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        TimeUnit.SECONDS.sleep(5);


        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Paid");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Case published test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Case published", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());



/*        WritersLogin();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]")).equals(number));
*/

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Case%20published");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div/table/tbody/tr[2]/td[3]/button").click();
        driver.switchTo().alert().accept();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/div[1]/div/div[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());

        driver.get("https://support.vip-writers.commentality.com/orders");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"upload-button\"]/span").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        jse.executeScript("scroll(0, 500);");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"fileUploadDropzone\"]").click();
        setClipboardData("C:\\Test.docx");
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
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"fileSubmitButton\"]").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-500);");
        TimeUnit.SECONDS.sleep(2);

        driver.get("https://support.vip-writers.commentality.com/orders");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Done", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());
        jse.executeScript("scroll(0,1500);");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[6]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/a").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-1500);");
        TimeUnit.SECONDS.sleep(3);

    }
    @Test
    public void MP4 () throws Exception {

        RegisteredStep3Inquiry();
        driver.manage().window().maximize();
        driver.get("https://support.vip-writers.commentality.com/signIn");
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div/div[3]/input"));
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/button"));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        login.sendKeys("support@test.com");
        password.sendKeys("Password1");
        signIn.click();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement filterID = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/thead/tr/th[1]"));



        filterID.click();
        String number = driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();

        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(5);

        driver.findElementByCssSelector(".order-details-actions > div:nth-child(1)").click();
        driver.findElementByCssSelector(".dropdown-menu > li:nth-child(3) > a:nth-child(1)").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("asdasdassadsadasdasdasdasdsadsadsadsadsadsadsadsa");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
        TimeUnit.SECONDS.sleep(6);

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a").click();
        TimeUnit.SECONDS.sleep(4);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[2]/div/input").sendKeys("666");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test test");
        driver.findElementByCssSelector("input.btn").click();
        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Inquiry%20applied");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Waiting for paymenttest");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);
        WritersLoginCom();

        TimeUnit.SECONDS.sleep(5);

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/WFP");

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();

        TimeUnit.SECONDS.sleep(3);

        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Paid test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();

        TimeUnit.SECONDS.sleep(10);

        WritersLoginCom();
        TimeUnit.SECONDS.sleep(5);


        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();


        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Paid");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Case published test");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Case published", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());



/*        WritersLogin();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]")).equals(number));
*/

        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div/div/form/div/div[2]/input").sendKeys("support@test.com");
        driver.findElementByXPath("/html/body/div/div/form/div/div[3]/input").sendKeys("Password1");
        driver.findElementByXPath("/html/body/div/div/form/div/div[4]/button").click();
        driver.get("https://support.vip-writers.commentality.com/orders_from_hintbox/Case%20published");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div/table/tbody/tr[2]/td[3]/button").click();
        driver.switchTo().alert().accept();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Not Confirmed", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/div[1]/div/div[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());

        driver.get("https://support.vip-writers.commentality.com/orders");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("In progress", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());

        WritersLoginCom();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"upload-button\"]/span").click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        driver.findElementByXPath("//*[@id=\"newFileForm\"]/div[2]/select/option[4]").click();
        jse.executeScript("scroll(0, 500);");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"fileUploadDropzone\"]").click();
        setClipboardData("C:\\Test.docx");
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
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"fileSubmitButton\"]").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-500);");
        TimeUnit.SECONDS.sleep(2);

        driver.get("https://support.vip-writers.commentality.com/orders");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr/td[1]/a").click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Done", driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button")).getText());
        jse.executeScript("scroll(0,1500);");
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[6]/div[2]/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/a").click();
        TimeUnit.SECONDS.sleep(5);
        jse.executeScript("scroll(0,-1500);");
        TimeUnit.SECONDS.sleep(3);

    }
}




