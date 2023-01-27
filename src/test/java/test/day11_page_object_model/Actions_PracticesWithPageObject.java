package test.day11_page_object_model;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;
import utilities.Driver;

public class Actions_PracticesWithPageObject {
HoversPage hoversPage;
    @Test
    public void Hover_Over_test() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        hoversPage=new HoversPage();
        Actions actions=new Actions(Driver.getDriver());

        //2.Hover over to first image
        //3.Assert:
        //"name:user1" is displayed
        Thread.sleep(3000);
        actions.moveToElement(hoversPage.img1).perform();
        Assert.assertTrue(hoversPage.img1.isDisplayed());

        //4.Hover over second img
        //5.Assert:
        //"name: user2" is displayed
        actions.moveToElement(hoversPage.img2).perform();
        Assert.assertTrue(hoversPage.img2.isDisplayed());

        //6.Hover over third img
        //7.Assert:
        //"name:user3" is displayed
        actions.moveToElement(hoversPage.img3).perform();
        Assert.assertTrue(hoversPage.img3.isDisplayed());



    }


}
