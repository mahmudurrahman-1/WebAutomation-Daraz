package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import pageObject.HomePage;
import pageObject.LoginPage;

import java.io.IOException;

public class Login {
    //Instances of class
    HomePage homePage = new HomePage();
    LoginPage loginpage =new LoginPage();

    //Actions
    @Given("^John on homepage after opening open site$")
    public void openHome(){
        homePage.waitForPageLoad();
    }

    @And("^John clicks SIGNUP/lOGIN button from the Nav bar$")
    public void NavigateToLogin(){
        homePage.signuporlogin();
    }

    @When("^John enters \"([^\"]*)\" and \"([^\"]*)\" to input fields$")
    public void LoginHandler(String em, String pass) throws IOException, InvalidFormatException {
        if (em.contains("email") && pass.contains("password")) {
            loginpage.waitForPageLoad();
            loginpage.HandleLogin();
        }
    }
    @Then("^John successfully Login$")
    public void ConfirmLogin(){
        loginpage.submit();
    }

}
