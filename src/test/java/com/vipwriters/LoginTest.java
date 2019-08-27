package com.vipwriters;


import com.PageWriter.Lending;
import com.SeleniumRunner;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
public class LoginTest extends WebDriverSettings {

   /* @Rule
    public TestWatcher screenshotOnFailure = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            makeScreenshotOnFailure();
        }

        @Attachment("Screenshot on failure")
        public byte[] makeScreenshotOnFailure() {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }
    };
*/
        @Test
        @io.qameta.allure.Description("Тест Логин не правельный ")
        public void Loginuser() throws Exception {
            driver.get(Writer_ProdUrl);
            TimeUnit.SECONDS.sleep(5);

            driver.findElementByXPath("//*[@id=\"sign-in-button\"]").click();
            TimeUnit.SECONDS.sleep(5);
            Lending.userName(driver).click();
            Lending.userName(driver).sendKeys(mail);
            Lending.password(driver).sendKeys(pass);
            Lending.loginButton(driver).click();
            TimeUnit.SECONDS.sleep(7);
         //   driver.findElementById("writers-available-orders-amount").click();
            assertEquals("Available Orders", driver.findElement(By.cssSelector("#root > div > div > div.writers-content > div:nth-child(2) > h2")).getText());

        }

        @Test
        public void UnLoginNoValid() throws InterruptedException {

            driver.get(Writer_ProdUrl);
            TimeUnit.SECONDS.sleep(5);

            driver.findElementByXPath("//*[@id=\"sign-in-button\"]").click();
            TimeUnit.SECONDS.sleep(5);
            Lending.userName(driver).click();
            Lending.userName(driver).sendKeys("test333@@ya.ru");
            Lending.password(driver).sendKeys(pass);
            Lending.loginButton(driver).click();
            TimeUnit.SECONDS.sleep(7);
            assertEquals("Please enter a correct username and password.", driver.findElement(By.cssSelector(".label")).getText());
        }

        @Test
        public void UnLoginEmptyFields() throws InterruptedException {
            driver.get(Writer_ProdUrl);
            TimeUnit.SECONDS.sleep(5);
            driver.findElementByXPath("//*[@id=\"sign-in-button\"]").click();
            TimeUnit.SECONDS.sleep(5);
            Lending.userName(driver).click();
            Lending.userName(driver).sendKeys("");
            Lending.password(driver).sendKeys("");
            Lending.loginButton(driver).click();
            TimeUnit.SECONDS.sleep(7);
            assertEquals("Please enter a correct username and password.", driver.findElement(By.cssSelector(".label")).getText());

        }

}
