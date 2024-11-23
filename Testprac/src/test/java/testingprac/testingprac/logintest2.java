package testingprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest2 {
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

        //giving a wrong input

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("potukuchi@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }

    }
}
