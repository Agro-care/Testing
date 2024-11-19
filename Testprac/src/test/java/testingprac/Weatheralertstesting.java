package testingprac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class firstseleniumTest {
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
    public void clickWeatherAlerts() {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mvrksk@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//li[text()='Weather Alerts']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        driver.findElement(By.xpath("//label[text()='Wednesday']")).click();
        driver.findElement(By.xpath("//label[text()='Tuesday']")).click();
        driver.findElement(By.xpath("//label[text()='Friday']")).click();




    }

    // Wait for successful login and dashboard load

}
