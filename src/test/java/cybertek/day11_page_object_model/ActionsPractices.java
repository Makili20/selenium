package cybertek.day11_page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsPractices {
    Actions actions;

    @Test
    public void scrolling_with_actions() throws InterruptedException {
        //get our page
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        //creating actions instance to be able to use its methods
        Actions actions = new Actions(Driver.getDriver());

        //locating web element we want to scroll to

        WebElement cyberTekSchoolLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        WebElement inputs = Driver.getDriver().findElement(By.linkText("Inputs"));

        //using actions instance we use moveToElement method
        Thread.sleep(3000);
        actions.moveToElement(cyberTekSchoolLink).perform();
        Thread.sleep(3000);
        actions.moveToElement(inputs).click().perform();

    }

    @Test
    public void TC16_double_click_test(){
       //1. Go to
       // https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
       // ck2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli\n" +
               "ck2");
        // 2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");
        // 3. Double click on the text “Double-click me to change my text color.”
        WebElement textToDoubleClick=Driver.getDriver().findElement(By.id("demo"));

        actions=new Actions(Driver.getDriver());
        actions.doubleClick(textToDoubleClick).perform();
        // 4. Assert:
        // Text’s “style” attribute value contains “red”.

        String actual=textToDoubleClick.getAttribute("style");
        System.out.println(actual);
        String expected="color: red;";
        Assert.assertTrue(actual.equals(expected));





    }
}
/*TC #1: Double Click Test
1. Go to
https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
ck2
2. Switch to iframe.
3. Double click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.

 */