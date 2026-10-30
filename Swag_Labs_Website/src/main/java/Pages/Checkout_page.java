package Pages;

import org.openqa.selenium.WebDriver;

public class Checkout_page {
    private WebDriver driver;
    Checkout_page (WebDriver driver){
        this.driver=driver;
    }
    public boolean isCheckoutPageDisplayed() {
        return driver.getCurrentUrl().contains("checkout-step-one.html");
    }
}
