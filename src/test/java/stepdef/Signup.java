package stepdef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import utilities.ExcelDataParser;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Signup {
    //instances
    HomePage homePage = new HomePage();
    RegistrationPage registration = new RegistrationPage();
    ExcelDataParser reader = new ExcelDataParser();


    //Actions
    @Given("^goto registration page$")
    public void gotoLoginPage() throws InterruptedException {
        homePage.waitForPageLoad();
        homePage.signuporlogin();
        registration.waitForPageLoad();
        registration.selectRegistration();
        registration.setWithEmail();
    }

    @When("^enter (.+) and (.+)$")
    public void HandleRegistation(String sheetname, int row) throws InterruptedException, IOException, InvalidFormatException {
        String email, fullName, password;int month, day, year, gender;
        List<Map<String, String>> testdata = reader.getData("src/main/resources/information.xlsx", sheetname);
        email = testdata.get(row).get("email");
        fullName = testdata.get(row).get("fullname");
        password = testdata.get(row).get("password");
        month =parseInt(testdata.get(row).get("month"));
        day = parseInt(testdata.get(row).get("day"));
        year = parseInt(testdata.get(row).get("year"));
        gender = parseInt(testdata.get(row).get("gender"));

        registration.setRegistration(email, fullName, password, month, day, year, gender);
        Thread.sleep(7000);
        registration.dragSlider();
    }

    @Then("^Successfully registered$")
    public void afterConfirmation() {
        registration.submit();
    }


}
