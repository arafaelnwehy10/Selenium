package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_swaglabs_page {
    private WebDriver driver;
    public Facebook_swaglabs_page(WebDriver driver){
        this.driver=driver;
    }
    private By closebuttonlocator=By.xpath("//div[@aria-label='Close']");
    public void clikcclosebutton(){
        driver.findElement(closebuttonlocator).click();
    }
    public String getcurrnturl(){
        return  driver.getCurrentUrl();
    }
}
