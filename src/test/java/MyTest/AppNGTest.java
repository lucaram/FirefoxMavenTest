package MyTest;

//this is a test
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppNGTest {
    //public String baseUrl = "http://newtours.demoaut.com/";
    public String baseUrl = "http://www.aimargini.com";
    public WebDriver driver = new FirefoxDriver();
    
    
    @Test
    public void verifyHomepageTitle() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(3000);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.quit();
    }
}
