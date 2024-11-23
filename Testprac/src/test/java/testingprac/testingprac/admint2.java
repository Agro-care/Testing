package testingprac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class admint2 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver and open the website
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://agro-assist-frontend.vercel.app/");
        driver.findElement(By.xpath("//li[text()='Login']")).click();

    }

    @AfterClass
    public void tearDown() {
//        driver.findElement(By.xpath("//li[text()='Logout']")).click();
//        driver.quit();
    }

    @Test
    public void TestfinalforAgroAssist() {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mvrkkautilya@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//li[text()='Admin Dashboard']")).click();

        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        String num = driver.findElement(By.xpath("//td[text()='Chillies']/following-sibling::td")).getText();
        System.out.println(num);



        driver.findElement(By.xpath("//input[@placeholder='Search item ...']")).sendKeys("Chillies");
        driver.findElement(By.xpath("//button[text()='Modify']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(Keys.DELETE);
        driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(String.valueOf(700));
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        String num2 = driver.findElement(By.xpath("//td[text()='Chillies']/following-sibling::td")).getText();
        Assert.assertNotEquals(num,num2);























    }


}
