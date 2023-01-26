package test.day6_testNg_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownsIntro {
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
    public void test1_default_value_verification() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        // 3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String actualDefaultOfSimpleDropDown = simpleDropDown.getFirstSelectedOption().getText();
        String expectedText = "Please select an option";
        Assert.assertEquals(actualDefaultOfSimpleDropDown, expectedText);
        // 4. Verify “State selection” default selected value is correct
        // Expected:"Select a State”“
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualDefaultOfStateDD = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateText = "Select a State";
        Assert.assertEquals(actualDefaultOfStateDD, expectedStateText);

    }

    @Test
    public void state_DropDown_Verification() throws InterruptedException {
        // Use all Select options. (visible text, value, index)
        // 3. Select Illinois
        Select stateDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(2000);
        stateDropDown.selectByValue("IL");
        //4. Select Virginia
        stateDropDown.selectByVisibleText("Virginia");
        //  5. Select California
        stateDropDown.selectByIndex(5);
        // 6. Verify final selected option is California.
        String expectedOption="California";
        String actualSelectedOption=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelectedOption,expectedOption);
        //Assert.assertTrue(actualSelectedOption.equals(expectedOption);
    }
    @Test
    public void date_DropDown_Verification() {
        //3. Select “December 1st, 1924” and verify it is selected.
                //Select year using : visible text
        Select specificYear=new Select(driver.findElement(By.xpath("//select[@id='year']")));
       specificYear.selectByVisibleText("1924");
       // Select month using : value attribute
        Select specificMonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        specificMonth.selectByValue("11");
       // Select day using : index number
        Select specificDay=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        specificDay.selectByIndex(0);
        System.out.println("selectSpecificYear.getFirstSelectedOption().isSelected() = "
                + specificYear.getFirstSelectedOption().isSelected());

        System.out.println("selectSpecificMonth.getFirstSelectedOption().isSelected() = "
                + specificMonth.getFirstSelectedOption().isSelected());

        System.out.println("selectSpecificDay.getFirstSelectedOption().isSelected() = "
                + specificDay.getFirstSelectedOption().isSelected());

    }
    @Test
    public void multipleSelectDD() throws InterruptedException{
       // 3. Select all the options from multiple select dropdown.
        // 4. Print out all selected values.
        Thread.sleep(2000);
        Select multipleOptions=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> languageList=multipleOptions.getOptions();
        for (WebElement eachLanguage : languageList) {
            eachLanguage.click();
            System.out.println(eachLanguage.getText());}

       // 5. Deselect all values.
            multipleOptions.deselectAll();
        for (WebElement eachLanguage : languageList){
        Assert.assertTrue(!eachLanguage.isSelected());
    }


}

    @Test
    public void nonSelectDD() throws InterruptedException{
        Thread.sleep(2000);
        //3. Click to non-select dropdown
       WebElement nonSelected= driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelected.click();
        //4. Select Facebook from dropdown

        //4. Select Facebook from dropdown
        WebElement faceBook_DropDown = driver.findElement(By.xpath("//a[.='Facebook']"));
        faceBook_DropDown.click();
       // 5. Verify title is “Facebook - Log In or Sign Up”

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "title did not match");

    }








}

