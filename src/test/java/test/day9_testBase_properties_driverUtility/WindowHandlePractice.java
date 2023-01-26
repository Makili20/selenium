package test.day9_testBase_properties_driverUtility;

import test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlePractice extends TestBase {

    @Test
    public void multiple_winodw_test(){
        //TC #1: Window Handle practice
        // 1. Create new test and make set ups
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

        String mainHandle=driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //3. Copy paste the lines from below into your class


        //  Lines to be pasted:'
        //we are downcasting our driver to JavascriptExecutor to be able to use its methods.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

//These lines will simply open new tabs using something called JavascriptExecutor
//and get those pages. We will learn JavascriptExecutor later as well.

        //4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("current title: "+driver.getTitle());
            if(driver.getCurrentUrl().contains("etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }



        }



    }








}
