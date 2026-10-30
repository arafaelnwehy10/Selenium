package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framespage {
    private WebDriver driver;
    private By nestedframeslocator=By.linkText("Nested Frames");
    public Framespage(WebDriver driver){
        this.driver=driver;
    }
    public Nestedframespage clicknestedframes(){
        driver.findElement(nestedframeslocator).click();
        return new Nestedframespage(driver);
    }

}
