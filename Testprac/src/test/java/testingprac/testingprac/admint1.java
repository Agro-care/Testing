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

public class admint1 {
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




        driver.findElement(By.xpath("//button[text()='Add Product']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("Chillies");
        driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Very Healthy and very helpful");
        driver.findElement(By.xpath("//input[@placeholder='Price ($)']")).sendKeys(String.valueOf(1100));
        driver.findElement(By.xpath("//input[@placeholder='Farmer ID']")).sendKeys("11F001");
        driver.findElement(By.xpath("//input[@placeholder='Location']")).sendKeys("Guntur");
        driver.findElement(By.xpath("//input[@placeholder='Stock']")).sendKeys(String.valueOf(500));
        driver.findElement(By.xpath("//input[@name='unit']")).sendKeys("kg");
        driver.findElement(By.xpath("//input[@placeholder='Harvest Date']")).sendKeys("11/22/2024");
        driver.findElement(By.xpath("//input[@placeholder='Category']")).sendKeys("Vegetables");
        driver.findElement(By.xpath("//input[@placeholder='Image URL']")).sendKeys("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiZSYR56xIkhD_W1aNLVnyWXJY8anhhW6-SQ&s");
        driver.findElement(By.xpath("//input[@name='brand']")).sendKeys("GOOD");

        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'bg-blue-600') and text()='Add Product']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button).click().perform();

        driver.navigate().refresh();




















    }


}
