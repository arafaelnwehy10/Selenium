package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Entryadpage {
private WebDriver driver;
private By buttoncloselocator=By.xpath("//p[text()=('Close')]");
    private By entryadlocator=By.xpath("//h3[text()=('Entry Ad')]");
public Entryadpage(WebDriver driver) {
        this.driver=driver;
    }
     public void clickclose(){
    driver.findElement(buttoncloselocator).click();
     }
     public String getentryadtext(){
    return driver.findElement(entryadlocator).getText();
     }
}
