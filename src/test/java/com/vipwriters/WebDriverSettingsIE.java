package com.vipwriters;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSettingsIE {



   // public FirefoxDriver driver;
  //  public ChromeDriver driver;
  public InternetExplorerDriver driver;
  //  @FindBy(xpath = ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
  //  public WebElement password;

  //  @FindBy(xpath= ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
  //  public WebElement login;


   // String mail = "nicolayqa@gmail.com";
   // String pass = "nicolayqa";

   public String mail = "gennadii2@test.com";
   public String pass = "Password1";

    @Before
    public void setup(){

          System.setProperty("webdriver.gecko.driver", "C://Programms/geckodriver.exe");
        // driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C://Programms/chromedriver.exe");
       // driver = new ChromeDriver();
         System.setProperty("webdriver.ie.driver", "C://Programms/IEDriverServer.exe");
       driver = new InternetExplorerDriver();


    }
    @After
    public void close(){
        driver.quit();

    }
    public void WritersLogin()
            throws Exception {
        driver.get("https://writer.urgentpapers.org");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));

        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
    }
    }
