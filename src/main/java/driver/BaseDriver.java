package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.PropertiesParser;

import java.time.Duration;
import java.util.Properties;

public class BaseDriver {

    public static WebDriver driver = null;
    Properties prop = PropertiesParser.loadProperties("basedriver.properties");

    public WebDriver initializeDriver(String browser) {
        if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("baseurl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setDriver(driver);
        return driver;
    }
}
