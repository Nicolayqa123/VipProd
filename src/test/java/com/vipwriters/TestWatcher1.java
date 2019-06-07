package com.vipwriters;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestWatcher1 extends WebDriverSettings{


    public WebDriver driver;

   @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(1600, 1000));

        }

        @Override
        protected void finished(Description description) {
            makeScreenshotOnFailure();
            driver.quit();
        }

        @Override
        protected void failed(Throwable e, Description description) {
            String newAutoTest = "TestFailure";
            File screenshot = ((TakesScreenshot) driver).
                    getScreenshotAs(OutputType.FILE);
            String path = "C:\\Programms\\GitHub\\VipWriter\\screenshot\\" + getClass() + screenshot.getName();
            try {
                FileUtils.copyFile(screenshot, new File(path));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            makeScreenshotOnFailure();
        }

        @Attachment("Screenshot on failure")
        public byte[] makeScreenshotOnFailure() {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }

    };
}
