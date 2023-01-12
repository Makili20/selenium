package day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8_CydeoVerification {
    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //3. Verify URL contains
        //Expected: cydeo
        String actualURl=driver.getCurrentUrl();
        String expectedURL="cydeo";
        if(actualURl.contains(expectedURL)){
            System.out.println("Url verification PASSED!");
        }else{
            System.out.println("Url verification FAILED!");
        }
        // 4. Verify title:
        //Expected: Practice
        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
    }
}
