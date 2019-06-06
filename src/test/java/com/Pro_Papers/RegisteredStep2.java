package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class RegisteredStep2 extends WebDriverSettings {
    Random r = new Random();
    int x = r.nextInt(90000) + 1;
    int v = r.nextInt(300) + 1;
    int z = r.nextInt(4) + 1;
    public String regmail = x + "test@test.com";
    public String regpass = "Password123";
    private String testText = "test text";

    @Test
    public void RegisteredStep() throws Exception {

        LoginPap();
        driver.get("https://client.urgentpapers.org/my/new_order");


        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[8]").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[4]").click();
        for (int i = 1; i <= 3; i++) {

            driver.findElement(oNSteps2Topic).sendKeys("as dfg hjkl");
            driver.findElement(oNsteps2PaperDetails).sendKeys(x+"");
            driver.findElement(oNsteps2PaperDetails).sendKeys("  ");
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select/option[3]").click();
        driver.findElement(oNSteps2NumberOfRef).sendKeys("2");
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(oNSteps3).click();
        TimeUnit.SECONDS.sleep(5);
        assertEquals("Spacing", driver.findElement(By.xpath("//*[@id=\"price\"]/div[3]/label")).getText());
    }


    public void RegisteredStep2Max() throws Exception {

        LoginPap();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://commentality.com/my/new_order");

        WebElement typeOfPaper = driver.findElement(By.xpath("//*[@id=\"details\"]/div[1]/label[2]/select"));
        WebElement adminEssay = driver.findElement(By.xpath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[1]"));
        WebElement subject = driver.findElement(By.xpath("//*[@id=\"details\"]/div[3]/label[2]/select"));
        WebElement arch = driver.findElement(By.xpath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[1]"));
        WebElement topic = driver.findElement(By.xpath("//*[@id=\"details\"]/div[5]/textarea"));
        WebElement paperDetails = driver.findElement(By.xpath("//*[@id=\"details\"]/div[7]/textarea"));
        WebElement paperFormat = driver.findElement(By.xpath("//*[@id=\"details\"]/div[9]/label[2]/select"));
        WebElement apa = driver.findElement(By.xpath("//*[@id=\"details\"]/div[9]/label[2]/select/option[1]"));
        WebElement numbOfRence = driver.findElement(By.xpath("//*[@id=\"inputnumberof\"]"));
        WebElement addMaterial = driver.findElement(By.xpath("//*[@id=\"details\"]/div[12]/button"));
        WebElement step3 = driver.findElement(By.xpath("//*[@id=\"details\"]/button"));


        typeOfPaper.click();
        adminEssay.click();
        subject.click();
        arch.click();
        topic.sendKeys("testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test ");
        paperDetails.sendKeys("testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test testtest test ");
        paperFormat.click();
        apa.click();
        numbOfRence.sendKeys("5");
        step3.click();

        assertEquals("Type of service", driver.findElement(By.xpath("//*[@id=\"price\"]/div[1]/label")).getText());
    }
}