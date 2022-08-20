package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

public class HomePage extends CommonMethods {
    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    //Locators
//    @FindBy(css = "a[data-spm-anchor-id='a2a0e.login_signup.header.d5']")
//    WebElement signuporlogin;
    @FindBy(xpath = "//a[text()='Signup / Login']")
    WebElement clickForRegistration;

    public void signuporlogin() {
        clickForRegistration.click();
    }


}
