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
        driver.findElement(By.xpath("//li[text()='Logout']")).click();
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void wholepage(){




        WebElement signUpLink = driver.findElement(By.xpath("//a[text()='or sign up']"));
        signUpLink.click();

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Prem sai");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("premsai.potukuchi@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
        driver.findElement(By.id("confirmPassword")).sendKeys("12345");

        WebElement dropdown = driver.findElement(By.xpath("//select[@name='role']"));
        Select dd = new Select(dropdown);
        dd.selectByVisibleText("User");

        driver.findElement(By.xpath("//button[@type='submit']")).click();





    }


}
