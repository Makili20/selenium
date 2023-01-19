package cybertek.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown_Practices {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void p7_mongth_dropdown_defaultValue_test() {
        //Locating the dropdown
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String actualDropdown = monthDropdown.getFirstSelectedOption().getText();
        System.out.println("actualDropdown = " + actualDropdown);
        String expectedDropdown = LocalDateTime.now().getMonth().name();
        System.out.println("expectedDropdown = " + expectedDropdown);
        Assert.assertEquals(actualDropdown.toLowerCase(), expectedDropdown.toLowerCase());
        //Assert.assertTrue(actualDropdown.equalsIgnoreCase(expectedDropdown);

        //Practice#8
//storing all of the options in the month dropdown into the list of web elements
       List<WebElement>actualDropDownOptions= monthDropdown.getOptions();

       List<String>expectedDropDownOptions= Arrays.asList("January","February","March","April","May",
               "June","July","August","September","October","November","December");
//we create a list of strings just to use as container to the texts of actual dropdown values
       List<String>actualMonthsText=new ArrayList<>();
        for (WebElement each : actualDropDownOptions) {
            actualMonthsText.add(each.getText());
        }

       Assert.assertEquals(actualMonthsText,expectedDropDownOptions);





    }
}