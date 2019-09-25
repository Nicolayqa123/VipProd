package com.Pro_Papers;

import com.PageClient.Registered;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


public class BannerTest extends WebDriverSettings {
    @Test
    public void BannerCheck () throws Exception {
        Random r = new Random();
        int x = r.nextInt(100000) + 1;

        driver.get(ProPapers_ProdUrl);
        TimeUnit.SECONDS.sleep(30);
        driver.findElementByCssSelector("#wl_custom_fields_holder > input").sendKeys(x + "testBanner@ya.ru");
        driver.findElementByCssSelector("#try_luck_btn").click();
        TimeUnit.SECONDS.sleep(20);
        String sum_discount = driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div.wlo_title > span").getText();
        String code_discount = driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div:nth-child(7) > input").getAttribute("value");
        String sum = sum_discount.replaceAll("\\D+","");
        System.out.println(sum_discount);
        System.out.println(sum);
        System.out.println(code_discount);
        driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div.wlo_btn.wlo_copy_code.not4freeprod").click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1450);");
//   driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_close.wlo_gpuac > div").click();
        NewOrderNotPay();
        jse.executeScript("scroll(0, 1450);");
        Registered.discount(driver).click();
        Registered.discount(driver).sendKeys(code_discount);
        driver.findElementByCssSelector("#details > div > div:nth-child(2)").click();
        TimeUnit.SECONDS.sleep(3);
       // assertEquals(sum_discount, driver.findElement(By.cssSelector("span.help-block:nth-child(5)")).getText().contentEquals("% discount code applied!"));
       // assertArrayEquals(sum_discount, driver.findElement(By.cssSelector("span.help-block:nth-child(5)")
       // assertTrue(sum_discount + "discount code applied!", driver.findElement(By.cssSelector("span.help-block:nth-child(5)")).getText().contentEquals("test")
       // assertTrue(driver.findElement(By.cssSelector("span.help-block:nth-child(5)")).getText().contains(sum_discount));
        String validCode = driver.findElementByCssSelector("span.help-block:nth-child(5)").getText();
        assertTrue(validCode.contains(sum + "% discount code applied!"));

    }
}
// oFP4n3AzqD