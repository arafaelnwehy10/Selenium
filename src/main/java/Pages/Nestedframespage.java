package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nestedframespage {
    private WebDriver driver;
    private By bodylocator=By.tagName("body");
    public Nestedframespage(WebDriver driver){
        this.driver=driver;
    }
    public String getleftframetext(){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String lefttext = driver.findElement(bodylocator).getText();
        driver.switchTo().defaultContent();
        return lefttext;
    }
    public String getbottomframetext(){
        driver.switchTo().frame("frame-bottom");
        String bottomtext = driver.findElement(bodylocator).getText();
        driver.switchTo().defaultContent();
        return bottomtext;
    }
}
