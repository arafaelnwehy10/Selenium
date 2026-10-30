package Pages;

import org.openqa.selenium.WebDriver;

public class Linkedin_swaglabs_page {
        private WebDriver driver;
        public Linkedin_swaglabs_page(WebDriver driver){
            this.driver=driver;
        }

        public String getcurrnturl(){
            return  driver.getCurrentUrl();
        }
}
