package cybertek.day6_testNg_dropdowns;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNgSeleniumPractice {

    @Test
    public void google_title_test(){
       //1.go to https://www.google.com
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
       //2.Verify title:Google
        String actualTitle= driver.getTitle();
        String expectedTitle="Google";
        //the line where we do assertion
        Assert.assertEquals(actualTitle,expectedTitle);
        //the line where we do assertion

    }





}
