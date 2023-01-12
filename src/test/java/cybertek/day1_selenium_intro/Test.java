package cybertek.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //1-set up the web driver
        WebDriverManager.chromedriver().setup();
        //2-create the instance of the chromedriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //the line above maximize the open page
        //3-test if driver is working
        driver.get("https://www.google.com");
        System.out.println("driver.getTitle()--> "+driver.getTitle());
        System.out.println("driver.getCurrentUrl()--> "+driver.getCurrentUrl());

        //BROWSER NAVIGATIONS
        //this line will take user to the previous page
        Thread.sleep(2000);//this line adds 2000 mili seconds of wait=2 seconds
        driver.navigate().back();

        Thread.sleep(2000);//Thread.sleep is being added just to be able to see selenium movements
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.facebook.com");
        System.out.println("driver.getTitle()--> "+driver.getTitle());
        System.out.println("driver.getCurrentUrl()--> "+driver.getCurrentUrl());

        System.out.println(driver.getPageSource());
        driver.close();








    }
}
