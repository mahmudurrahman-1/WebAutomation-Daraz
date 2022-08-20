package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;

public class PageDriver {
    private PageDriver() {
        //empty
    }

    private static final ThreadLocal<WebDriver> wd = new ThreadLocal<>();
    private static PageDriver instance = null;

    //
    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();
        }
        return instance;
    }

    //
    public void setDriver(WebDriver driver) {
        wd.set(driver);
    }

    //
    public WebDriver getDriver() {
        return wd.get();
    }

    //
    public static WebDriver getCurrentDriver() {
        return getInstance().getDriver();
    }
}
