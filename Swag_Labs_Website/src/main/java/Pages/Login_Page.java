package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    private WebDriver driver;
    public Login_Page(WebDriver driver){
        this.driver=driver;
    }
    private By username_field_loctor=By.id("user-name");
    private By password_field_loctor=By.id("password");
    private By login_button_loctor=By.id("login-button");
    private By erorr_message_locator= By.cssSelector("[data-test='error']");
    public void setusername(String username){
        driver.findElement(username_field_loctor).sendKeys(username);
    }
    public void setpassword(String password){
        driver.findElement(password_field_loctor).sendKeys(password);
    }
    public Inventory_Page press_login_button(){
        driver.findElement(login_button_loctor).click();
        return new Inventory_Page(driver);
    }
    public String get_error_message(){
        return driver.findElement(erorr_message_locator).getText();
    }
    public String getcurrnturl(){
      return   driver.getCurrentUrl();
    }
}
