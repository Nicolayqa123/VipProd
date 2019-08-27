package com;

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


public class test404Url extends WebDriverSettings {

    String urlCheck = "https://pro-papers.com/argumentative-essay-writing";

    public static void main(String[] args)
    {
        Random r = new Random();

       // int x = r.nextInt(2);
       // String[] urlForCheck = {"https://pro-papers.com/argumentative-essay-writing", "https://pro-papers.com/assignment-writing-service"};

      //  String urlCheck = urlForCheck[x];

        FirefoxDriver driver;
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("asd");

      //  driver.get("https://pro-papers.com/english-homework-help");

        List<WebElement> links=driver.findElements(By.tagName("link"));

        System.out.println("Total links are "+links.size());

        for(int i=0;i<links.size();i++)
        {

            WebElement ele= links.get(i);

            String url=ele.getAttribute("href");

            verifyLinkActive(url);

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
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {

        }
    }


    @Test
    public void Check404andHref () {
        driver.get("asd");

    }

}
