package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

import java.util.List;


public class RegistrationPage extends CommonMethods {
    public RegistrationPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }


    //Locators

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registration;

    @FindBy(xpath = "//button[text()='Sign up with Email']")
    WebElement withEmailbutton;

    @FindBy(css = "input[type='text']")
    List<WebElement> inputEmail;
    @FindBy(css = "input[type='text']")
    List<WebElement> inputName;
    @FindBy(css = "input[type='text']")
    List<WebElement> inputPassword;
    @FindBy(id="nc_2_n1z")
    WebElement dragIt;

    /*****************
     * Inputs
     */
    @FindBy(className = "next-menu-item")
    List<WebElement> nmi;
    @FindBy(id = "month")
    WebElement selectMonth;
    @FindBy(id = "day")
    WebElement selectDay;
    @FindBy(id = "year")
    WebElement selectYear;
    @FindBy(id = "gender")
    WebElement selectGender;
    @FindBy(xpath = "//button[text()='SIGN UP']")
    WebElement submit;

    //Actions
//With email
    public void setWithEmail() {
        withEmailbutton.click();
    }

    //Registration button
    public void selectRegistration() {
        registration.click();
    }

    //drag to verify
    public void dragSlider() {
        sliderMove(dragIt);
    }

    //input everything
    public void setRegistration(String email, String fullName, String password, int month, int day, int year, int gender) throws InterruptedException {
        sendText(inputEmail.get(0), email);
        sendText(inputName.get(3), fullName);
        sendText(inputPassword.get(2), password);
        selectMonth.click();
        nmi.get(month).click();
        Thread.sleep(2000);
        selectDay.click();
        nmi.get(day).click();
        Thread.sleep(2000);
        selectYear.click();
        nmi.get(year).click();
        Thread.sleep(2000);
        selectGender.click();
        nmi.get(gender).click();
    }

    //submit registration form
    public void submit() {
        submit.click();
    }

}
