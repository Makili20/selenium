package test.day12_sunchronization;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ForgotPasswordTests {
   LoginPage loginPage;
    @Test
    public void ForgotPassTest(){

        //1.Go to https://qa2.vytrack.com
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        //2.Click to 'Forgot your password?"link
        loginPage=new LoginPage();
        loginPage.forgotPasswordLink.click();
        //3.Verify title changed to expected
        //Expected: "Forgot Password"
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Forgot Password";
        Assert.assertEquals(actualTitle,expectedTitle);
        //4.Verify url is as expected:
        //Expected:"https://qa2.vytrack.com/user/reset-request"
        //Note:Follow Page Object Model design pattern
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa2.vytrack.com/user/reset-request";
        Assert.assertEquals(actualUrl,expectedUrl);




    }


    //TC:Vytrack forgot password page verification-->ERROR MESSAGE
  //  1.Go to "https://qa2.vytrack.com/user/reset-request"
    @Test
    public void error_message_verification() {

        Driver.getDriver().get(ConfigurationReader.getProperty("forgotpassword_url"));
        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();
        String randomString="sgfdf";
        // 2.Enter random username
        forgotPasswordPage.inputBox.sendKeys("sgfdf");
        // 3.Click to request button
        forgotPasswordPage.requestButton.click();
        // 4.
        //  Verify error message is displayed
        Assert.assertTrue(forgotPasswordPage.errorMessage.isDisplayed());
        //  5.Verify error message txt is as expected;
        String actualTextErrorMess=forgotPasswordPage.errorMessage.getText();
        String expectedTextErrorMess="There is no active user with username or email address \"" +
                randomString+"\".";
        Assert.assertEquals(actualTextErrorMess,expectedTextErrorMess);
        // Expected:There is no active user with username or email address"given text",

    }


}
