package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example2page { private WebDriver driver;
    public Example2page(WebDriver driver){
        this.driver=driver;
    }
    private By start_button_locator =By.cssSelector("#start>button");
    private By loaded_message_locator =By.cssSelector("#finish>h4");
    public void click_start2(){
        driver.findElement(start_button_locator).click();
    }
    public String get_message(){
        //=============================================
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //=============================================
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(loaded_message_locator));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loaded_message_locator)));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loaded_message_locator));
        return driver.findElement(loaded_message_locator).getText();
    }


}
