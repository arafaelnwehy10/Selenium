package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver){
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
           System.out.println("the current window is " + windowhandle);
           driver.switchTo().window(windowhandle);
           if (driver.getTitle().equals(tabtitle)){
               break;
           }
       }
    }
}
