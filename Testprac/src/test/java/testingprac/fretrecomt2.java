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

public class fretrecomt2 {
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

        driver.findElement(By.xpath("//li[text()='Fertilizer Recommendation']")).click();


        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Fertilizer recommendation

        Select obj1 = new Select(driver.findElement(By.id("language-selector")));
        obj1.selectByVisibleText("chinese (simplified)");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select soil = new Select(driver.findElement(By.xpath("//select[@class='border-2 border-green-600 p-2 rounded-sm w-64']")));
        soil.selectByVisibleText("Loamy");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select fret = new Select(driver.findElement(By.xpath("//label[text()='Select a Crop Type:']/following-sibling::select")));
        fret.selectByVisibleText("Sugarcane");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@placeholder='Enter moisture value']")).sendKeys("38");
        driver.findElement(By.xpath("//input[@placeholder='Enter nitrogen value']")).sendKeys("35");
        driver.findElement(By.xpath("//input[@placeholder='Enter phosphorous value']")).sendKeys("34");
        driver.findElement(By.xpath("//input[@placeholder='Enter potassium value']")).sendKeys("0");
        driver.findElement(By.xpath("//input[@placeholder='Enter temperature']")).sendKeys("26");
        driver.findElement(By.xpath("//input[@placeholder='Enter humidity']")).sendKeys("52");
        driver.findElement(By.xpath("//input[@placeholder='Enter city']")).sendKeys("tianjin");

        driver.findElement(By.xpath("//button[text()='Get Fertilizer Recommendation']")).click();



        WebElement new1 = driver.findElement(By.xpath("//strong[@class='border m-2 p-2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", new1);



        String predfret = driver.findElement(By.xpath("//strong[@class='border m-2 p-2']")).getText();
        String expectfret = "尿素";
        Assert.assertEquals(predfret,expectfret);


        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
