package cybertek.day4_FindElements_Checkboxes_Radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P02_FIndElements_Apple {
    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        // 3. Click to iPhone
        WebElement iPhoneLink = driver.findElement(By.xpath("//span[.='iPhone']/.."));
        iPhoneLink.click();

        // //4. Print out the texts of all links
        //we need to locate all the links on the page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        int linksWithoutText = 0;
        int linksWithText = 0;
        //this will return all of the links inside of the body
        for (WebElement eachLink : allLinks) {
            String textOfLinks = eachLink.getText();
            System.out.println(textOfLinks);

            // 5. Print out how many link is missing text
            if (textOfLinks.isEmpty()) {
                linksWithoutText++;
            } else {
                System.out.println(textOfLinks);
                linksWithText++;
            }
        }
        System.out.println("The number of links that does NOT have text: " + linksWithoutText);
        // 6. Print out how many link has text
        System.out.println("The number of links with text: " + linksWithText);
        //  7. Print out how many total link
        System.out.println("Number of Total links: " + allLinks.size());


    }
}
