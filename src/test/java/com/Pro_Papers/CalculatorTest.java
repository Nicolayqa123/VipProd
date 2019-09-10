package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class CalculatorTest extends WebDriverSettings {
    @Test
    public void Check_Calculator () throws Exception {
        driver.get(ProPapers_StageUrl);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        TimeUnit.SECONDS.sleep(2);
        driver.findElementByCssSelector("body > footer > div.cookies-notification > div > p > button").click();
        jse.executeScript("scroll(0, 1450);");
        TimeUnit.SECONDS.sleep(1);
        assertEquals("USD\n" +"9.99", driver.findElement(By.cssSelector(".result")).getText());
        Select type_of_paper = new Select(driver.findElement(By.cssSelector(".academic-level")));
        type_of_paper.selectByValue("2");
        Select deadline = new Select(driver.findElement(By.cssSelector(".deadline")));
        deadline.selectByValue("2");
        assertEquals("USD\n" +"16.99", driver.findElement(By.cssSelector(".result")).getText());

        Select academic_level = new Select(driver.findElement(By.cssSelector(".type-of-paper")));
        academic_level.selectByValue("1401");
        type_of_paper.selectByValue("3");
        deadline.selectByValue("7");
        driver.findElementById("words-count").clear();
        driver.findElementById("words-count").sendKeys("1200");
        driver.findElementByCssSelector(".cals-pages-wrapper > label:nth-child(2)").click();

        assertEquals("USD\n" +"349.95", driver.findElement(By.cssSelector(".result")).getText());





    }
}
