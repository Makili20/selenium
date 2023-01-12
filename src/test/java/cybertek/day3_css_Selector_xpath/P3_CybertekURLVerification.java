package cybertek.day3_css_Selector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerification {
    public static void main(String[] args) {
        // TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3. Enter any email into input box
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("dgegde@gmail.com");
        //4. Click on Retrieve password
        WebElement retrievePass = driver.findElement(By.id("form_submit"));
        retrievePass.click();
        //5. Verify URL contains:
        //Expected: “email_sent”
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "email_sent";
        System.out.println("The current URL: " + actualUrl);
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }
        //6. Verify textbox displayed the content as expected.
        //Expected: “Your e-mail’s been sent!”
        WebElement confirmationMess = driver.findElement(By.name("confirmation_message"));
        // String actualMess= driver.findElement(By.name("confirmation_message")).getText();
        String actualMess= confirmationMess.getText();
        String expectedMess="Your e-mail's been sent!";
        if(actualMess.equals(expectedMess)){
            System.out.println("Confirmation message text verification PASSED!");
        }else{
            System.out.println("Confirmation message text verification FAILED!!");
        }
        if(confirmationMess.isDisplayed()){
            System.out.println("Message is displayed,verification PASSED!");
        }else{
            System.out.println("Message is NOT displayed,verification FAILED!");
        }
    }
}
