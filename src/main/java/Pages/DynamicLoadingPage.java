package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    private By link1_locator = By.partialLinkText("Example 1:");
    private By link2_locator = By.partialLinkText("Example 2:");
    public Example1page click_link1(){
        driver.findElement(link1_locator).click();
        return new Example1page(driver);
    }
    public Example2page click_link2(){
        driver.findElement(link2_locator).click();
        return new Example2page(driver);
    }
}
