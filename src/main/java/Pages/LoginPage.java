package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    private By usernamelocator = By.id("username");
    private By passwordlocator = By.id("password");
    private By loginbutton = By.cssSelector("#login>button");

    public void setusername(String username){
        driver.findElement(usernamelocator).sendKeys(username);
    }
    public void setpassword(String password){
        driver.findElement(passwordlocator).sendKeys(password);
    }
    public SecureAreaPage clickloginbutton(){
        driver.findElement(loginbutton).click();
        return new SecureAreaPage(driver);
    }
}
