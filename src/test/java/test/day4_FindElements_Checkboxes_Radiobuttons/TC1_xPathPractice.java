package test.day4_FindElements_Checkboxes_Radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC1_xPathPractice {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //  3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        // a. “Home” link
        WebElement homeLink=driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println(homeLink.getText());
        //  b. “Forgot password” header
        WebElement forgotPass=driver.findElement(By.xpath("//div[@class='example']/h2"));
        System.out.println(forgotPass.getText());
        // c. “E-mail” text
        WebElement emailText=driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println(emailText.getText());
        //  d. E-mail input box
        WebElement emailBox=driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println(emailBox.getText());
        // e. “Retrieve password” button
        WebElement passButton=driver.findElement(By.xpath("//button[@id='form_submit']/i"));
        System.out.println(passButton.getText());
        // f. “Powered by Cybertek School” text
        // 4. Verify all WebElements are displayed.
    }
}
