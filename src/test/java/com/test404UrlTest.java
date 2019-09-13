package com;

import Regression.CheckTitle;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class test404UrlTest extends WebDriverSettings {

    String urlCheck = "https://pro-papers.com/argumentative-essay-writing";


    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {
            FirefoxDriver driver;
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");

            driver = new FirefoxDriver();

            driver.manage().window().maximize();


            /*Random r = new Random();
            int x = r.nextInt(2) + 1;*/

            // driver.get("asd");




            String[] page = {"/accounting-writing-service", "/algebra-homework-help", "/annotated-bibliography-writing", "/anthropology-writing-service"
                    , "/archaeology-writing-service"};
            String pages = page[x];
            driver.get("https://client.urgentpapers.org" + pages);
            String Title = driver.getTitle();

            if (Title.contains("404")){
                System.out.println(driver.getCurrentUrl() + pages + "--" + Title);
            }

            List<WebElement> links = driver.findElements(By.tagName("link"));

            System.out.println("Total links are " + links.size());

            for (int i = 0; i < links.size(); i++) {

                WebElement ele = links.get(i);

                String url = ele.getAttribute("href");

                verifyLinkActive(url);


            }

        driver.close();
        }

    }
    public static void verifyLinkActive(String linkUrl)
    {

        try
        {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

            httpURLConnect.setConnectTimeout(3000);

            httpURLConnect.connect();

            if(httpURLConnect.getResponseCode()==200)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==404)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==500)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {

        }

    }



}
