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

public class croprecomt2 {
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

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("premsai.potukuchi@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//li[text()='Crop Recommendation']")).click();

        Select obj = new Select(driver.findElement(By.id("language-selector")));
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.selectByVisibleText("japanese");

        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@placeholder='Enter the Temperature']")).sendKeys("24");
        driver.findElement(By.xpath("//input[@placeholder='Enter the value of Humidity']")).sendKeys("68");
        driver.findElement(By.xpath("//input[@placeholder='Enter the value of Nitrogen']")).sendKeys("90");
        driver.findElement(By.xpath("//input[@placeholder='Enter the value of Phosphorus']")).sendKeys("49");
        driver.findElement(By.xpath("//input[@placeholder='Enter the value of Potassium']")).sendKeys("21");
        driver.findElement(By.xpath("//input[@placeholder='Enter the soil pH value (0-14)']")).sendKeys("6.5");
        driver.findElement(By.xpath("//input[@placeholder='Enter the rainfall gauge (in mm)']")).sendKeys("74");

        driver.findElement(By.xpath("//button[text()='Get Crop Recommendation']")).click();
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String crop = driver.findElement(By.xpath("//*[normalize-space(text())='トウモロコシ']")).getText();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement new2 = driver.findElement(By.xpath("//*[normalize-space(text())='トウモロコシ']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", new2);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    // Wait for successful login and dashboard load


    // Wait for successful login and dashboard load

}
