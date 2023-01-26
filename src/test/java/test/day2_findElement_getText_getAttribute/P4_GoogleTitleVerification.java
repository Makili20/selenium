package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleTitleVerification {
    public static void main(String[] args) {
        //TC#3: Google search
        //1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2-Go to:https://www.google.com
        driver.get("https://www.google.com");
        //3-write "apple" in search box
       // driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        driver.findElement(By.name("q")).sendKeys("apple");
        //4-click google search button
        driver.findElement(By.name("btnK")).click();
        //5-Verify title:
        String actualTitle=driver.getTitle();
        String expectedTitle="apple";
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Google search verification PASSED");
        }else{
            System.err.println("Google search verification FAILED!!");
        }



    }
}
