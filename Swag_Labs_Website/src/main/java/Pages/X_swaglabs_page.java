package Pages;

import org.openqa.selenium.WebDriver;

public class X_swaglabs_page {
    private WebDriver driver;
    public X_swaglabs_page(WebDriver driver){
        this.driver=driver;
    }

    public String getcurrnturl(){
        return  driver.getCurrentUrl();
    }


}
