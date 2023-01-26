package test.day11_page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class NegativeLoginTest {

    @Test
    public void negative_loginTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        WebElement usernameInput = Driver.getDriver().findElement(By.id("prependedInput"));
        WebElement passwordInput = Driver.getDriver().findElement(By.id("prependedInput2"));

        WebElement loginButton = Driver.getDriver().findElement(By.id("_submit"));

        String username=ConfigurationReader.getProperty("storemanager_username");

        usernameInput.sendKeys(username);

        passwordInput.sendKeys("fdefrfr");

        loginButton.click();

        WebElement errorMessage=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-error']"));
        Assert.assertTrue(errorMessage.isDisplayed(),"Assert message is not displayed!");
    }


}
