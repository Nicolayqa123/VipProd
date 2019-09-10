package com.Pro_Papers;

import com.PageClient.Registered;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;



public class Banner extends WebDriverSettings {
    @Test
    public void BannerCheck () throws Exception {
        Random r = new Random();
        int x = r.nextInt(10000) + 1;

        driver.get(ProPapers_StageUrl);
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByCssSelector("#wl_custom_fields_holder > input").sendKeys(x + "testBanner@ya.ru");
        driver.findElementByCssSelector("#try_luck_btn").click();
        TimeUnit.SECONDS.sleep(15);
        String sum_discount = driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div.wlo_title > span").getText();
        String code_discount = driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div:nth-child(7) > input").getText();
        driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div.wlo_btn.wlo_copy_code.not4freeprod").click();
        NewOrderNotPay();
        Registered.discount(driver).sendKeys(code_discount);
        assertEquals(sum_discount + "discount code applied!", driver.findElement(By.cssSelector("span.help-block:nth-child(5)")).getText());



    }
}
// oFP4n3AzqD