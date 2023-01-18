package cybertek.day6_testNg_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestNgSeleniumPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test (priority = 2)
    public void google_title_test() {
        //1.go to https://www.google.com
        //2.Verify title:Google
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        //the line where we do assertion
        Assert.assertEquals(actualTitle, expectedTitle);
        //the line where we do assertion
    }

    @Test(priority = 1)
    public void google_search_title_verification() throws InterruptedException {
        //1.open browser
        //2.go to https://www.google.com
        //3.search"apple"
        WebElement appleSearchBox= driver.findElement(By.name("q"));
        //sending apple string into searchbox and pressing enter
        appleSearchBox.sendKeys("apple"+ Keys.ENTER);
        //4.verify title contains "apple"
        String expectedInTitle="apple";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        //5.close browser

    }


}
