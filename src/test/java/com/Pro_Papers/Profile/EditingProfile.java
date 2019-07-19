package com.Pro_Papers.Profile;

import com.PageClient.Page;
import com.PageClient.Profile;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class EditingProfile extends WebDriverSettings {


    @Test
    public void EditProfile() throws Exception {

        LoginPap();

        Page.Profile(driver).click();
        Profile.FirstName(driver).clear();
        Profile.FirstName(driver).sendKeys("NicolayTest");
        Profile.LastName(driver).clear();
        Profile.LastName(driver).sendKeys("ChiuriTest");
        Profile.Email(driver).clear();
        Profile.Email(driver).sendKeys("Kallyan21@ya.ru");
        Profile.Phone(driver).clear();
        Profile.Phone(driver).sendKeys("");
        driver.findElement(By.cssSelector(".selected-flag > div:nth-child(1)")).click();
        driver.findElementByCssSelector("li.country:nth-child(224)").click();
        Profile.Phone(driver).sendKeys("231545645654");
        Profile.Button_save_changes(driver).click();
        TimeUnit.SECONDS.sleep(1);
        assertEquals("Saved", driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button")).getText());
        TimeUnit.SECONDS.sleep(2);

        Profile.FirstName(driver).clear();
        Profile.FirstName(driver).sendKeys("Nicolay");
        Profile.LastName(driver).clear();
        Profile.LastName(driver).sendKeys("Chiuri");
        Profile.Email(driver).clear();
        Profile.Email(driver).sendKeys("Kallyan2@ya.ru");
        Profile.Phone(driver).clear();
        Profile.Phone(driver).sendKeys("");
        driver.findElement(By.cssSelector(".selected-flag > div:nth-child(1)")).click();
        driver.findElementByCssSelector("li.country:nth-child(223)").click();
        Profile.Phone(driver).sendKeys("4566544565");
        Profile.Button_save_changes(driver).click();
        TimeUnit.SECONDS.sleep(1);
        assertEquals("Saved", driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button")).getText());
    }

    @Test
    public void EditProfileEmptyField() throws Exception {

        LoginPap();
        Page.Profile(driver).click();

        Profile.FirstName(driver).clear();
        assertEquals("Please enter valid first name", driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[4]/div/div/div/div[1]/div[1]/span")).getText());

        Profile.LastName(driver).clear();
        assertEquals("Please enter valid last name", driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[4]/div/div/div/div[1]/div[2]/span")).getText());

        Profile.Email(driver).clear();
        assertEquals("Please enter valid email", driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div/div[4]/div/div/div/div[3]/div/div[1]/div/span")).getText());

    }

    public void AlternativeMailAndPhone () throws Exception {
        LoginPap();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a").click();
            TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/input").sendKeys("asdf@asd.ru");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/input").sendKeys("123456");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 550);");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button").click();

    }

    public void AlternativeMailAndPhoneMin () throws Exception {
        LoginPap();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a").click();
            TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/input").sendKeys("a@a.ru");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/input").sendKeys("1");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 550);");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button").click();

    }

    public void AlternativeMailAndPhoneMax () throws Exception {
        LoginPap();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a").click();
            TimeUnit.SECONDS.sleep(2);
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/input").sendKeys("asdfsdfasdfsdafdsfsdfs@@dsafasdfsadfsderwrwrwerwrwefsada@as.ru");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/input").sendKeys("050123456789123456789123423456789");
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Please enter valid alt. email", driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[9]/td[2]/span/text()")).getText());

        assertEquals("Please enter valid alt. phone", driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[10]/td[2]/span/text()")).getText());
    }
}
