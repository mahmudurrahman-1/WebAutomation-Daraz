package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test//java/feature/login.feature",
        glue = "stepdef"
)
public class Boom extends AbstractTestNGCucumberTests {
}
