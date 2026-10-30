package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertspage {
    private WebDriver driver;
    private By alertlocator=By.xpath("//button[contains(.,'Alert')] ");
    private By confirmlocator=By.xpath("//button[contains(.,'Confirm')] ");
    private By promptlocator=By.xpath("//button[contains(.,'Prompt')] ");
    private By messagelocator =By.id("result");
    public JavaScriptAlertspage(WebDriver driver){
        this.driver=driver;
    }
    public void clickalert(){
    driver.findElement(alertlocator).click();
    }
    public void clickcofirm(){
        driver.findElement(confirmlocator).click();
    }
    public void clickprompt(){
        driver.findElement(promptlocator).click();
    }
    public void acceptalert(){
        driver.switchTo().alert().accept();
    }
    public void dismissalert(){
        driver.switchTo().alert().dismiss();
    }
    public void setprompttext(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getmessagealert(){
        return driver.switchTo().alert().getText();
    }
    public String getmessage(){
    return  driver.findElement(messagelocator).getText();
    }

}
