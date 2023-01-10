package cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        //1-set up the web driver
        WebDriverManager.chromedriver().setup();
        //2-create the instance of the chromedriver
        WebDriver driver=new ChromeDriver();
        //3-test if driver is working
        driver.get("https://www.google.com");
        //BROWSER NAVIGATIONS

        




    }
}
