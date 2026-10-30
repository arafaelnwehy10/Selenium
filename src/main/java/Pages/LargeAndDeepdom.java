package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LargeAndDeepdom {
    private WebDriver driver;
    public LargeAndDeepdom(WebDriver driver){
        this.driver=driver;
    }
//    private By elementlocator=By.className("no-js");
    public void scrolltotablebyamount(){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(270, 2700).perform();
    }
//    public void scrolltotabbytoelement(){
//        Actions actions= new Actions(driver);
//        actions.scrollToElement(driver.findElement(elementlocator));
//
//    }


}
