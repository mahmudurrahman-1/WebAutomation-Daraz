package stepdef;

import io.cucumber.java.en.Given;
import pageObject.HomePage;

public class Login {
    //Instances of class
    HomePage homePage = new HomePage();

    //Actions
    @Given("^logging in$")
    public void test() {
        //
    }
}
