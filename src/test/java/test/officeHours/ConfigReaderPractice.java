package test.officeHours;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderPractice {
    private static Properties properties;
    WebDriver driver;

    static {
        try (FileInputStream fileInputStream = new FileInputStream("configuration.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
            public static String getProperty (String key){
                return properties.getProperty(key);
            }

    public static void main(String[] args) {
      String browser=properties.getProperty("browser");
        System.out.println(browser);
        System.out.println(properties.getProperty("url"));

}

@Test
    public void loginTest() throws Exception{
        String browser=getProperty("browser");
        String URL=getProperty("url");
        String username=getProperty("username");
        String password=getProperty("password");
  driver= WebDriverFactory.getDriver(browser);
  driver.get(URL);
  driver.findElement(By.id("prependedInput")).sendKeys(username);
  driver.findElement(By.id("prependedInput2")).sendKeys(password, Keys.ENTER);
  Thread.sleep(5000);

  String expectedTitle="Dashboard";
  String actual=driver.getTitle();
    Assert.assertEquals(actual,expectedTitle,"Page title is not correct");
}
@AfterMethod
    public void tearDown(){
        driver.quit();

}



}
