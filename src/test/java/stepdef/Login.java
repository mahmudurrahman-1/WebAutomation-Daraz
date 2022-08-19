package stepdef;

import io.cucumber.java.en.Given;
import pageObject.HomePage;

public class Login {
    HomePage homePage = new HomePage();

    @Given("^logging in$")
    public void test(){
        homePage.Test();
    }
}
