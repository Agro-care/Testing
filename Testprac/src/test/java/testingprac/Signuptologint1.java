package testingprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Signuptologint1 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver and open the website
        //result singuptologintest //test success

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://agro-assist-frontend.vercel.app/");
        driver.findElement(By.xpath("//li[text()='Logout']")).click();

    }

    @AfterClass
    public void tearDown() {
//        driver.findElement(By.xpath("//li[text()='Logout']")).click();
//        driver.quit();
    }

    @Test
    public void TestfinalforAgroAssist() {

        //checking without @gmail.com


        driver.findElement(By.xpath("//a[text()='or sign up']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vikalang");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("premsai161002@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("12345");

        Select obj = new Select(driver.findElement(By.xpath("//select[@name='role']")));
        obj.selectByVisibleText("Farmer");

        driver.findElement(By.xpath("//a[@href='/login']")).click();



        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("premsai.potukuchi@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }

        String title = driver.findElement(By.xpath("//h1[text()='Empowering Farmers with Technology']")).getText();
        String actt = "Empowering Farmers with Technology";
        Assert.assertEquals(title,actt);
    }
}
