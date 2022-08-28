package pageObject;

import driver.PageDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;
import utilities.ExcelDataParser;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
    public void HandleLogin() throws IOException, InvalidFormatException {
        ExcelDataParser myExcel = new ExcelDataParser();
        List<Map<String, String>> data= myExcel.getData("src/main/resources/information.xlsx","login");
        String email= data.get(0).get("Email");
        String password= data.get(0).get("Password");
        sendText(inputEmail, email);
        sendText(inputPassword, password);
    }

    //submit login
    public void submit() {
        submit.click();
    }
}
