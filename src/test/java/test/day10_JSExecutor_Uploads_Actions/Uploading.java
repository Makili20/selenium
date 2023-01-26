package test.day10_JSExecutor_Uploads_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Uploading {

    @Test
    public void UploadingTest() throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement chooseFile=Driver.getDriver().findElement(By.id("file-upload"));
        Thread.sleep(4000);
        chooseFile.sendKeys("\"C:\\Users\\marij\\OneDrive\\Desktop\\Test.txt\"");
        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-submit"));
        WebElement uploadedMessage=Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3"));
        Assert.assertTrue(uploadedMessage.isDisplayed());




    }
}
