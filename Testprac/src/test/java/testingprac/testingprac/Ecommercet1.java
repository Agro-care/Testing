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

public class Ecommercet1 {
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

        driver.findElement(By.xpath("//li[text()='Ecommerce Store']")).click();


        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select price = new Select(driver.findElement(By.cssSelector(".filter-dropdown:nth-of-type(1)")));
        price.selectByVisibleText("$1375 - $1750");

        Select cat = new Select(driver.findElement(By.cssSelector(".filter-dropdown:nth-of-type(2)")));
        cat.selectByVisibleText("Seed");






        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addtocart);

        WebElement productLink = driver.findElement(By.xpath("//a[@class='product-link block relative']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productLink);


        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

        WebElement enter = driver.findElement(By.xpath("//textarea[@class='w-full p-3 border rounded-md mb-4' and @placeholder='Write your review here...']"));
        enter.sendKeys("very good good item will buy from here daily");

        Select star = new Select(driver.findElement(By.xpath("//select[@class='p-2 border rounded-md']")));
        star.selectByValue("4");

        driver.findElement(By.xpath("//button[text()='Submit Review']")).click();

        driver.findElement(By.xpath("//li[span[@class='cart-count']]")).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.chord(Keys.CONTROL,"1"),"2");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }











    }


}
