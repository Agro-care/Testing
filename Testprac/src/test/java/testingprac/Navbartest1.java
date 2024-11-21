package testingprac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Navbartest1 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver and open the website
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://agro-assist-frontend.vercel.app/");
        driver.findElement(By.xpath("//li[text()='Logout']")).click();



    }

    @AfterClass
    public void tearDown() {
        driver.findElement(By.xpath("//li[text()='Logout']")).click();
        driver.quit();
    }

    @Test
    public void TestfinalforAgroAssist() {

        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("premsai.potukuchi@gmail.com");
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//li[text()='Home']")).click();

        driver.findElement(By.xpath("//li[text()='Rent Here']")).click();
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
        driver.findElement(By.xpath("//li[text()='Ecommerce Store']")).click();
        driver.findElement(By.xpath("//li[text()='Disease Prediction']")).click();

        driver.findElement(By.xpath("//li[text()='Weather Alerts']")).click();

        driver.findElement(By.xpath("//li[text()='Fertilizer Recommendation']")).click();

        driver.findElement(By.xpath("//li[text()='Crop Recommendation']")).click();
        driver.findElement(By.xpath("//li[span[@class='cart-count']]")).click();








    }
}