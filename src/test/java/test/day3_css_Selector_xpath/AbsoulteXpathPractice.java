package test.day3_css_Selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class AbsoulteXpathPractice {
    public static void main(String[] args) {

//go to http://practice.cybertekschool.com/multiple_buttons
        //verify if the "Home' link is displayed on the page

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement homeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        if (homeLink.isDisplayed()) {
            System.out.println("Home link is displayed.PASS!");
        } else {
            System.out.println("Home link is displayed.FAILED!!");
        }


    }
}
