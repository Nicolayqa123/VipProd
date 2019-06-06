package com.vipwriters;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PageWhatYouGet extends WebDriverSettings {
    @Test
    public void whatYouget () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/whatyouget");
            TimeUnit.SECONDS.sleep(1);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        assertEquals("Free registration\n" +
                "High salary\n" +
                "Interesting orders to work on\n" +
                "24/7 assistance", driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/ul")).getText());

            TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingTwo\"]/h4/a").click();
        assertEquals("Wide range of academic fields\n" +
                "Different types of papers\n" +
                "Different academic levels\n" +
                "Your own workload", driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/ul")).getText());

            TimeUnit.SECONDS.sleep(1);

        driver.findElementByXPath("//*[@id=\"headingThree\"]/h4/a").click();
        assertEquals("Talented and skilled writers\n" +
                "Writers experienced in academic and non-academic writing\n" +
                "Writers with excellent written English\n" +
                "Writers willing to turn their knowledge into cash", driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul")).getText());
        jse.executeScript("scroll(0, 550);");
            TimeUnit.SECONDS.sleep(1);


        driver.findElementByXPath("#headingThree > h4 > a").click();
        assertEquals("Mathematics\n" +
                "Engineering\n" +
                "MATLAB\n" +
                "SPSS\n" +
                "Physics\n" +
                "Technology\n" +
                "Medicine\n" +
                "Communication", driver.findElement(By.xpath("//*[@id=\"collapseFour\"]")).getText());

    }
}
