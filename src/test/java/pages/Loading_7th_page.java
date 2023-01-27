package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loading_7th_page {

    public Loading_7th_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath="//strong")
        public WebElement doneMessage;
        @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
        public WebElement spongeBobImage;




}
