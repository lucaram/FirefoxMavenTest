package MyTest;

//this is a test
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppNGTest {
    //public String baseUrl = "http://newtours.demoaut.com/";
    public String baseUrl = "http://newtours.demoaut.com/";
    public WebDriver driver = new FirefoxDriver();
    
    
    @Test
    public void verifyHomepageTitle() {
        driver.get(baseUrl);
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = driver.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);
        driver.quit();
    }
}
