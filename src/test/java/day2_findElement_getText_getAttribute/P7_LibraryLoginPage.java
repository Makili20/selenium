package day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7_LibraryLoginPage {
    public static void main(String[] args) {
        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");
        //3. Enter username: “incorrect@email.com”
        driver.findElement(By.id("inputEmail")).sendKeys("incorrect@email.com");
        //4. Enter password: “incorrect password”
        driver.findElement(By.id("inputPassword")).sendKeys("incorrect password");
        //5. Click to Sign in button
        driver.findElement(By.tagName("button")).click();
        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        WebElement displayMessage=driver.findElement(By.tagName("div"));
        String actualMessage=displayMessage.getText();
        String expectedMessage="Sorry, Wrong Email or Password";
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Display message verification PASSED!");
        }else{
            System.out.println("Display message verification FAILED!");
        }



    }
}
