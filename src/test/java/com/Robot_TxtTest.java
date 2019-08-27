package com;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Robot_TxtTest extends WebDriverSettings {

    @Test
    public void CheckRobotTxtStage() throws Exception {
        driver.get("https://client.urgentpapers.org/robots.txt");
        assertFalse("User-agent: *\n" +
                "Disallow: /", Boolean.parseBoolean(driver.findElement(By.xpath("/html/body/pre")).getText()));

    }

    @Test
    public void CheckRobotTxtProd() throws Exception {
        driver.get("https://pro-papers.com/robots.txt");
        assertEquals("User-agent: *\n" +
                "Allow: /\n" +
                "Disallow: /my\n" +
                "Disallow: /order\n" +
                "Disallow: /inquiry\n" +
                "Sitemap: /sitemap.xml", driver.findElement(By.xpath("/html/body/pre")).getText());

    }
}
