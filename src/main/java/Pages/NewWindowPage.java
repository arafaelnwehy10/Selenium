package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage {
    private WebDriver driver;
    public  NewWindowPage (WebDriver driver){
        this.driver=driver;
    }
    private By newwindowlocator=By.tagName("h3");
    public String gettext(){
     return    driver.findElement(newwindowlocator).getText();
    }
}
