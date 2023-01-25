package cybertek.day10_JSExecutor_Uploads_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsTest {

    @Test
    public void hover_over_test1() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com");
        //1-Create the instance of Actions class
        //2-Pass the current driver instance
        Actions actions = new Actions(Driver.getDriver());
        //3-Locate the web element to hover over
        WebElement languageOptions = Driver.getDriver().findElement(By.id("icp-nav-flyout"));
        Thread.sleep(4000);
        //4-Using actions,hover over to the Language options
        actions.moveToElement(languageOptions).perform();

    }

    @Test
    public void tc15_hover_test() throws  InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        //We need to locate images and text
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the "user" texts under here:
        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

        //2. Hover over to first image
        Thread.sleep(2);
        actions.moveToElement(img1).perform();

        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());

        //4. Hover over to second image
        Thread.sleep(2);
        actions.moveToElement(img2).perform();

        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

        //6. Hover over to third image
        Thread.sleep(2);
        actions.moveToElement(img3).perform();

        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());


    }}
