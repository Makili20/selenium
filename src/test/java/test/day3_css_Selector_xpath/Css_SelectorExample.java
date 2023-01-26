package test.day3_css_Selector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Css_SelectorExample {
    public static void main(String[] args) {
        //Search Amazon
        //1.Open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2/Go yo https://amazon.com
        driver.get("https://amazon.com");
        //3.Enter any seacrh term(use cssSelector to locate search box)
      WebElement webSearch= driver.findElement(By.cssSelector("input[dir='auto']"));
      webSearch.sendKeys("wooden spoon"+ Keys.ENTER);
        //4.Verify title contains the search term
String actualTitle= driver.getTitle();
String expectedTitle="wooden spoon";
if(actualTitle.contains(expectedTitle)){
    System.out.println("Title verification PASSED!");
}else{
    System.out.println("Title verification FAILED!");
}


    }
}
