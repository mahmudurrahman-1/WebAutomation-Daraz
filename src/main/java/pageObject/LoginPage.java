package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

public class LoginPage extends CommonMethods {
    public LoginPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    //Locators
    @FindBy(css = "input[type='text']")
    WebElement inputEmail;
    @FindBy(css = "input[type='password']")
    WebElement inputPassword;
    @FindBy(css = "button[type='submit']")
    WebElement submit;

    //Actions
    //Login handler
    public void HandleLogin(String email, String password) {
        sendText(inputEmail, email);
        sendText(inputPassword, password);
    }

    //submit login
    public void submitTo() {
        submit.click();
    }
}
