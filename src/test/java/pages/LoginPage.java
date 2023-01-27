package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/*
This class we will store all login page related web elements and methods into this class.
 */
public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);}
        //this method initElememnts is creating a connection between our WebDriver
        //and then the instance of object of the class so whenever we want to use anything
        //in this class ,our driver will not get lost,it will recognize because it will be
        //connected with the object of this class

    //locating username input box
        @FindBy(id ="prependedInput")
        public WebElement usernameInput;

    //locating input password
    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    //locating login button
    @FindBy(id="_submit")
    public WebElement loginButton;

    //locating error message
    @FindBy(xpath ="//div[@class='alert alert-error']" )
    public WebElement errorMessage;




}
