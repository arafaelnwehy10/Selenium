package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keypressespage {
    private WebDriver driver;
    private By inputfield = By.id("target");
    private By resultmessage = By.id("result");
     public Keypressespage(WebDriver driver){
         this.driver=driver;
     }
public void settext(String text){
         driver.findElement(inputfield).sendKeys(text);
     }
     public String gettext(){
      return    driver.findElement(resultmessage).getText();
     }
}
