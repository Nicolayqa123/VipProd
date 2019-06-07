package com.Pro_Papers.Profile;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class EditingProfileTest extends WebDriverSettings {

    public void EditProfile() throws Exception {

        LoginPap();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[2]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[2]/td[2]/input").sendKeys("NicolayQAtest");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[3]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[3]/td[2]/input").sendKeys("NicolasTest");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[4]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[4]/td[2]/input").sendKeys("kallyan2@ya.ru");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input").sendKeys("79124566455");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[6]/td[2]/select/option[170]").click();
        driver.findElementByXPath("//*[@id=\"timezone\"]").click();
        driver.findElementByXPath("//*[@id=\"timezone\"]/option[69]").click();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button").click();
        assertEquals("Saved", driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button")).getText());

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[2]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[2]/td[2]/input").sendKeys("NicolayQA");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[3]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[3]/td[2]/input").sendKeys("Nicolas");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[4]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[4]/td[2]/input").sendKeys("nicolaychiuri@gmail.com");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input").sendKeys("380 50 457 8555");
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[6]/td[2]/pp-country-input/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[6]/td[2]/pp-country-input/input").sendKeys("Ukraine");
        driver.findElementByXPath("//*[@id=\"timezone\"]").click();
        driver.findElementByXPath("//*[@id=\"timezone\"]/option[70]").click();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button").click();
        assertEquals("Saved", driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[12]/td[2]")).getText());
    }


    public void EditProfileEmtyField() throws Exception {

        LoginPap();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[2]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[3]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[4]/td[2]/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input").clear();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[6]/td[2]/pp-country-input/input").clear();
        driver.findElementByXPath("//*[@id=\"timezone\"]").click();
        driver.findElementByXPath("//*[@id=\"timezone\"]/option[69]").click();
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button").click();
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[2]/td[2]/input").click();
        assertEquals("NicolayQA", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[1]/div[2]/span[1]")).getText());

    }
    @Test
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
    @Test
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
    @Test
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
