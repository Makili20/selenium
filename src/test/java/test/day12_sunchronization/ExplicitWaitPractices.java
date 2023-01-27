package test.day12_sunchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading_7th_page;
import utilities.Driver;

public class ExplicitWaitPractices {


    @Test
    public void Dynamic_Title_Test() {
        //TC:Dinamically Loaded Page Elements 7
        //1.GO to http://practice.cybertekschool.com/dynamic_load
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
        //2.Wait until title is "Dynamic Title"
        Loading_7th_page loading_7th_page=new Loading_7th_page();
        //creating the instance of WebDriverWiat to use its methods
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        //we are using the object to set up our EXPECTED CONDITION
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3.Assert: Messahe "Done" is displayed.
        Assert.assertTrue(loading_7th_page.doneMessage.isDisplayed());
        //4.Assert:Image is displayed
        Assert.assertTrue(loading_7th_page.spongeBobImage.isDisplayed());
        //Note:Follow POM


    }

}
