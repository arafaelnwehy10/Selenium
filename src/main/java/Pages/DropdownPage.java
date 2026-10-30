package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
     private WebDriver driver;
     private By dropdownlocator = By .id("dropdown");
   public DropdownPage(WebDriver driver){
       this.driver=driver;
   }
   public void selectfromdropdown(String option){
        getdropdown().selectByVisibleText(option);
   }
   public List<String> getselectedoptions(){
        List<WebElement> selectelements=getdropdown().getAllSelectedOptions();
        List<String> selectedoptions = new ArrayList<>();
        for(WebElement element:selectelements){
            selectedoptions.add(element.getText());
       }
        return selectedoptions;
   }

   public Select getdropdown()
   {
       return new Select(driver.findElement(dropdownlocator));
   }

}
