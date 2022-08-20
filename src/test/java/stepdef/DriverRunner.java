package stepdef;

import driver.BaseDriver;
import driver.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.PropertiesParser;

import java.util.Properties;

public class DriverRunner extends BaseDriver {
    Properties prop = PropertiesParser.loadProperties("basedriver.properties");

    @Before
    public void startUp() {
        driver = initializeDriver(prop.getProperty("br1"));
    }

    @After
    public void tearDown() {
        PageDriver.getCurrentDriver().quit();
    }
}
