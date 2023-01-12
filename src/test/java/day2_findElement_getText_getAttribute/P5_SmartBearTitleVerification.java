package day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class P5_SmartBearTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2-Go to:
       // http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3-verify title equals:
       // Expected: Web Orders Login
        String actualLoginTitle=driver.getTitle();
        String expectedLoginTitle="Web Orders Login";
        if(actualLoginTitle.equals(expectedLoginTitle)){
            System.out.println("Login Title Verification PASSED");
        }else{
            System.out.println("Login Title Verification FAILED!!");
        }
        //4-Enter username:Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("tester");
        //5-Enter password:test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //6-Click "Sign In"button
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        //7-Verify title equals:
        //Expected:Web Orders
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Landing Page title verification PASSED!");
        }else{System.out.println("Landing Page title verification FAILED!!");

        }
        Thread.sleep(2000);
        driver.navigate().back();
        driver.quit();





    }
}
