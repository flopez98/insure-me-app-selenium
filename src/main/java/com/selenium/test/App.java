package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        //System.setProperty("webdriver.chrome.driver", "/home/labs/Downloads/chromedriver-linux64/chromedriver");
        
    	WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println( "Script excetuting..." );
        
        //1. Open the browser and get to the URL
        driver.get("http://3.84.246.242:8081/contact.html");
        
        //2. Wait for the page to load
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //3. Locate and input name
        driver.findElement(By.id("inputName")).sendKeys("Random");
        //Thread.sleep(1000);
        
        //4. Locate and input number
        driver.findElement(By.id("inputNumber")).sendKeys("111-111-1111");
        //Thread.sleep(1000);
        
        //5. Locate and input mail
        driver.findElement(By.id("inputMail")).sendKeys("test@test.com");
        //Thread.sleep(1000);
        
        //6. Locate and input message
        driver.findElement(By.id("inputMessage")).sendKeys("This is a message");
        //Thread.sleep(1000);
        
        //7. Send info
        driver.findElement(By.id("my-button")).click();
        //Thread.sleep(1000);
        
        driver.quit();
        
        System.out.println( "Script executed successfully" );
    }
}
