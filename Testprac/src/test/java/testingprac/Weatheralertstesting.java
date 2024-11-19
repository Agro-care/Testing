package testingprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class firstseleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://agro-assist-frontend.vercel.app/");
        driver.findElement(By.xpath("//li[text()='Weather Alerts']")).click();
//        driver.findElement(By.xpath("//li[text()='Logout']")).click();


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void wholepage(){
        driver.findElement(By.xpath("//li[text()='Logout']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mvrksk@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.id("react-select-3-placeholder")).sendKeys("Abuja, NG");

















    }


}
