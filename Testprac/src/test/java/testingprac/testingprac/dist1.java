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

public class dist1 {
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
        driver.findElement(By.xpath("//li[text()='Logout']")).click();
        driver.quit();
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

        driver.findElement(By.xpath("//li[text()='Disease Prediction']")).click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select lang = new Select(driver.findElement(By.id("language-selector")));
        lang.selectByVisibleText("telugu");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file' and @accept='image/*']"));
        fileInput.sendKeys("C:/Users/prems/Downloads/bangala.jpg");

        driver.findElement(By.xpath("//button[text()='Predict Disease']")).click();



        try {
            Thread.sleep(2400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String dpre = driver.findElement(By.xpath("//p[@class='text-green-700 text-lg']")).getText();
        String dact =  "బంగాళదుంప___ప్రారంభ_ముడత";
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement new3 = driver.findElement(By.xpath("//p[@class='text-green-700 text-lg']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", new3);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(dpre,dact);

    }
    // Wait for successful login and dashboard load


    // Wait for successful login and dashboard load

}
