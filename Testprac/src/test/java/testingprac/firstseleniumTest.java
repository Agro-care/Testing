package testingprac;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.channels.AsynchronousServerSocketChannel;
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
//        driver.quit();
    }

    @Test
    public void croprecommendation() {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("premsai.potukuchi@gmail.com");
        driver.findElement(By.id("loggingPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//li[text()='Fertilizer Recommendation']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //crop recommendation

        Select obj = new Select(driver.findElement(By.id("language-selector")));
        obj.selectByVisibleText("telugu");

        Select soil = new Select(driver.findElement(By.xpath("//select[@class='border-2 border-green-600 p-2 rounded-sm w-64']")));
        soil.selectByVisibleText("Loamy");

        Select crop = new Select(driver.findElement(By.xpath("//label[text()='Select a Crop Type:']/following-sibling::select")));
        crop.selectByVisibleText("Wheat");

        driver.findElement(By.xpath("//input[@placeholder='Enter moisture value']")).sendKeys("50");
        driver.findElement(By.xpath("//input[@placeholder='Enter nitrogen value']")).sendKeys("41");
        driver.findElement(By.xpath("//input[@placeholder='Enter phosphorous value']")).sendKeys("0");
        driver.findElement(By.xpath("//input[@placeholder='Enter potassium value']")).sendKeys("0");
        driver.findElement(By.xpath("//input[@placeholder='Enter temperature']")).sendKeys("33");
        driver.findElement(By.xpath("//input[@placeholder='Enter humidity']")).sendKeys("64");
        driver.findElement(By.xpath("//input[@placeholder='Enter city']")).sendKeys("Guntur");

        driver.findElement(By.xpath("//button[text()='Get Fertilizer Recommendation']")).click();

        String predcrop = driver.findElement(By.xpath("//strong[@class='border m-2 p-2']")).getText();
        String expectcrop = "యూరియా";
        Assert.assertEquals(predcrop,expectcrop);

//        Weather Alerts

        driver.findElement(By.xpath("//li[text()='Weather Alerts']")).click();
        driver.findElement(By.xpath("//label[text()='Monday']")).click();
        driver.findElement(By.xpath("//label[text()='Tuesday']")).click();
        driver.findElement(By.xpath("//label[text()='Wednesday']")).click();
        driver.findElement(By.xpath("//label[text()='Thursday']")).click();
        driver.findElement(By.xpath("//label[text()='Friday']")).click();
        driver.findElement(By.xpath("//label[text()='Saturday']")).click();
        driver.findElement(By.xpath("//label[text()='Sunday']")).click();



        driver.findElement(By.xpath("//li[text()='Disease Prediction']")).click();
        Select lang = new Select(driver.findElement(By.id("language-selector")));
        lang.selectByVisibleText("telugu");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file' and @accept='image/*']"));
        fileInput.sendKeys("C:/Users/prems/OneDrive/Desktop/img.png");

        driver.findElement(By.xpath("//button[text()='Predict Disease']")).click();

        String dpre = driver.findElement(By.xpath("//p[@class='text-green-700 text-lg']")).getText();
        String dact =  "ద్రాక్ష___ఎస్కా_(నలుపు_మీజిల్స్)";
        Assert.assertEquals(dpre,dact);



        driver.findElement(By.xpath("//li[text()='Ecommerce Store']")).click();

        Select price = new Select(driver.findElement(By.cssSelector(".filter-dropdown:nth-of-type(1)")));
        price.selectByVisibleText("$1376 - $1939");

        Select cat = new Select(driver.findElement(By.cssSelector(".filter-dropdown:nth-of-type(2)")));
        cat.selectByVisibleText("Seed");

        String typeofcat = driver.findElement(By.xpath("//span[text()='Seed']")).getText();
        String actcat = "Seed";

        Assert.assertEquals(typeofcat,actcat);

        String amount = driver.findElement(By.xpath("//p[contains(@class, 'product-price') and contains(@class, 'text-indigo-600')]")).getText();
        int amountt = Integer.parseInt(amount.replaceAll("[^\\d]", ""));
        int min = 1376;
        int max = 1939;
        Assert.assertTrue(amountt >= min && amountt <= max, "Amount is not within the expected range.");

        String Pname = driver.findElement(By.xpath("//h3[text()='Quinoa']")).getText();
        driver.findElement(By.xpath("//h3[text()='Quinoa']")).click();

        String expecname = driver.findElement(By.xpath("//h1[text()='Quinoa']")).getText();
        Assert.assertEquals(Pname, expecname);


        WebElement textArea = driver.findElement(By.xpath("//textarea[@class='w-full p-3 border rounded-md mb-4']"));

//         Enter review text into the textarea
        String reviewText = "Good Product Love it";
        textArea.sendKeys(reviewText);

        Select ratin = new Select(driver.findElement(By.xpath("//select[@class='p-2 border rounded-md']")));
        ratin.selectByValue("4");

        driver.findElement(By.xpath("//button[text()='Submit Review']")).click();

        String reviewtext = "Good Product Love it";
       String expre = driver.findElement(By.xpath("//p[text()='Good Product Love it']")).getText();
        Assert.assertEquals(expre,reviewtext);

        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();


        driver.findElement(By.xpath("//li[text()='Ecommerce Store']")).click();





        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

        System.out.println("I clicked add to two times which will be assigned for two different products we have to check total items to be 2" );
        String quan = driver.findElement(By.xpath("//span[text()='2']")).getText();
        String q2 = "(2)";

        Assert.assertEquals(quan,q2);


        driver.findElement(By.xpath("//li[span[@class='cart-count']]")).click();

        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.chord(Keys.CONTROL,"1"),"2");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//button[text()='Remove']")).click();

























































    }
    // Wait for successful login and dashboard load

}
