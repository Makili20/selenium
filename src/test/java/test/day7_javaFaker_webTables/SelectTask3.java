package test.day7_javaFaker_webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SelectTask3 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void task3_Select_DateTask() {
        // 3. Select “December 1st, 1921” and verify it is selected.
        // Select year using : visible text
        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropDown.selectByVisibleText("1924");
        String actualYear=yearDropDown.getFirstSelectedOption().getText();
        String expectedYear="1924";
        Assert.assertEquals(actualYear,expectedYear);

        // Select month using : value attribute
        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropDown.selectByValue("11");
        String actualMonth=monthDropDown.getFirstSelectedOption().getText();
        String expectedMonth="December";
        Assert.assertEquals(actualMonth,expectedMonth);
        // Select day using : index number
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);
        String actualDay=dayDropDown.getFirstSelectedOption().getText();
        String expectedDay="1";
        Assert.assertEquals(actualDay,expectedDay);
    }
}
