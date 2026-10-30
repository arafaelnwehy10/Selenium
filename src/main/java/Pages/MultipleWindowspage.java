package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowspage {
   private WebDriver driver;
   public MultipleWindowspage(WebDriver driver){
       this.driver=driver;
   }
   private By clickbuttonlocator=By.partialLinkText("Click Here");

   public NewWindowPage clickonbutton(){
       driver.findElement(clickbuttonlocator).click();
       return new NewWindowPage(driver);
   }

}
