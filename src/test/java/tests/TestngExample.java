package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestngExample {

    protected WebDriver driver;

    @BeforeTest
    @Parameters({ "browser" })
    public void Setup(String browser) {
        if (browser.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "./Drivers/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new ChromeDriver(chromeOptions);
        }
        if (browser.contains("Firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
             driver=new FirefoxDriver();
        }
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();
            driver.navigate().to("https://keytorc.com");

    }
    @Test
    public void test1(){
        driver.findElement(By.xpath("//a[@href='/blog']")).click();
    }  @Test
    public void test2(){
        driver.findElement(By.xpath("//a[@href='/test-yayinlari']")).click();
    }

    @AfterTest()
    public void afterTest() throws IOException {
        driver.quit();
    }

}
