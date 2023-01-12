package cybertek.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_LinkTextLocator {
    public static void main(String[] args) throws InterruptedException {
//1-open the chrome browser and go to Google
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.google.com");
        //2-click to Gmail link from top right
        driver.findElement(By.linkText("Gmail")).click();
        //3-verify title contains gmail,expected :"Gmail"
        String actualGmailTitle = driver.getTitle();
        String expectedGmailTitle = "Gmail";
        if (actualGmailTitle.contains(expectedGmailTitle)) {
            System.out.println("Gmail title verification PASSED!");
        } else {
            System.err.println("Gmail totle verification FAILED!!");
        }
        //4-Go back to Google page by using back()
        driver.navigate().back();
        //5-Verify title equals to Google
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google page title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!!");
        }
        driver.close();


    }
}
