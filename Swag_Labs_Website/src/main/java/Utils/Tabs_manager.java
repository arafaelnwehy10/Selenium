package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Tabs_manager {
    private WebDriver driver;
    public Tabs_manager(WebDriver driver){
        this.driver=driver;
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void refresh(){
        driver.navigate().refresh();
    }

    public void switchtotab(String tabtitle){
        Set<String> windowhandles= driver.getWindowHandles();
        for(String windowhandle:windowhandles) {
            driver.switchTo().window(windowhandle);
            if (driver.getTitle().equals(tabtitle)){
                break;
            }
        }
    }

}
