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

public class rentheret1 {
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
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }



        driver.findElement(By.xpath("//li[text()='Rent Here']")).click();

        driver.findElement(By.xpath("//button[text()='+ Add Equipment']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mahindra tractor");
        driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys("Brand Mahindra Tractor");
        driver.findElement(By.xpath("//input[@placeholder='Rental Price']")).sendKeys("150");
        driver.findElement(By.xpath("//input[@placeholder='Location']")).sendKeys("Arravali Hills/India");
        Select star = new Select(driver.findElement(By.xpath("//select[@class='mb-2 w-full p-2 border rounded']")));
        star.selectByVisibleText("Available");
        driver.findElement(By.xpath("//input[@placeholder='Image URL']")).sendKeys("https://upload.wikimedia.org/wikipedia/commons/6/63/Mahindra_Tractor.jpg");
        driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9890377884");
        driver.findElement(By.xpath("//input[@placeholder='Contact Email']")).sendKeys("premsai.potukuchi@gmail.com");

        driver.findElement(By.xpath("//button[text()='Add']")).click();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }


        driver.findElement(By.xpath("//button[text()='Edit']")).click();

        Select change = new Select(driver.findElement(By.xpath("//select[@class='mb-2 w-full p-2 border rounded']")));
        change.selectByVisibleText("Rented");

        driver.findElement(By.xpath("//button[text()='Save']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();

        WebElement productLink = driver.findElement(By.xpath("//button[text()='Contact Now']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productLink);













    }


}
