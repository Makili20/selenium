package test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablePractices {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void p5_printNames_cities(WebDriver driver){
        //The list wherev we store all the names in the web table
        List<WebElement> namesList=driver.findElements(By.xpath("//table[@id='//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
List<WebElement> citiesList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));
//instead oif creating for each loop,we will create regular for loop
        //because we can use the int i index number to get both names and cities values
for(int i=0;i<namesList.size();i++){
    System.out.println("Name: "+namesList.get(i).getText()+", Cities: "+citiesList.get(i).getText());
}

    }





}