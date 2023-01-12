package cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_ZeroBank_UrlVerification {
    public static void main(String[] args) {
       // TC #4: Zero Bank URL verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Get attribute value of href from the “forgot your password” link
       // driver.findElement(By.ByLinkText("Forgot your password"))
        WebElement forgotPassLink=driver.findElement(By.partialLinkText("Forgot"));
        //4. Verify attribute value contains
        //Expected: “/forgot-password.html”
        String actualHrefValue=forgotPassLink.getAttribute("href");
        String expectedHrefValue="/forgot-password.html";
        System.out.println("Actual href value= "+actualHrefValue);
        if(actualHrefValue.contains(expectedHrefValue)){
            System.out.println("Href value verification PASSED!");
        }else{
            System.out.println("Href value verification FAILED!");
        }
        System.out.println("Is forgot password is displayed? "+forgotPassLink.isDisplayed());
    }
}
