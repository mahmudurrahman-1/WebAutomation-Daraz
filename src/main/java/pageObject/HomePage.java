package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    public void Test(){
        System.out.println("Hello");
    }
}
