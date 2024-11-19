package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class testing {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=675108909030&hvpos=&hvnetw=g&hvrand=16445221084154850402&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9004731&hvtargid=kwd-12712441&ref=pd_sl_48s8op24vs_e&hydadcr=15239_13597371");

    }
}
