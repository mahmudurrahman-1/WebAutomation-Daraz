package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature/registration.feature",
        glue = "stepdef",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
               "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)
public class Boom extends AbstractTestNGCucumberTests {
}
