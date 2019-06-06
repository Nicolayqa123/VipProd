package com.vipwriters;

import com.PageWriter.MailUs;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MailUSFormTest extends WebDriverSettings {

    @Test
    public void mailUs () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectQuestion(driver).click();
        for (int i = 1; i <= 5; i++) {
            MailUs.message(driver).sendKeys("test text mail US");
            MailUs.message(driver).sendKeys(" ");
        }
        MailUs.message(driver).sendKeys("test text mail US");

        MailUs.sendMessage(driver).click();
        TimeUnit.SECONDS.sleep(8);
      //  assertEquals("Message sucessfully sent!", driver.findElement(By.id("swal2-title")).getText());

    }
    @Test
    public void mailUsmin () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectQuestion(driver).click();
        MailUs.message(driver).sendKeys("t");
        MailUs.sendMessage(driver).click();
        TimeUnit.SECONDS.sleep(8);
     //   assertEquals("Form is not valid!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsmax () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectQuestion(driver).click();
        for (int i = 1; i <= 50; i++) {
            MailUs.message(driver).sendKeys("test text mail US");
            MailUs.message(driver).sendKeys(" ");
        }
        MailUs.sendMessage(driver).click();
        TimeUnit.SECONDS.sleep(8);
     //   assertEquals("Message sucessfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsEmptySubject () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        for (int i = 1; i <= 5; i++) {
            MailUs.message(driver).sendKeys("test text mail US");
            MailUs.message(driver).sendKeys(" ");
        }
        MailUs.sendMessage(driver).click();
        TimeUnit.SECONDS.sleep(8);
     //   assertEquals("Form is not valid!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsOther () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectOther(driver).click();

        for (int i = 1; i <= 5; i++) {
            MailUs.customSubject(driver).sendKeys("asda asd asd");
            MailUs.customSubject(driver).sendKeys(" ");
            MailUs.message(driver).sendKeys("test text mail US");
            MailUs.message(driver).sendKeys(" ");
        }
        MailUs.sendMessage(driver).click();
        TimeUnit.SECONDS.sleep(8);
      //  assertEquals("Message sucessfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
}
