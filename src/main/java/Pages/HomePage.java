package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver =driver;
    }
//   private By formauthenticationlink = By.linkText("Form Authentication");
//    private By forgetpasswordlocator= By.linkText("Forgot Password");

   public LoginPage clickformauthentication(){
//    driver .findElement(formauthenticationlink).click();
       clicklink("Form Authentication");
    return new LoginPage(driver);
   }
   public MultipleWindowspage clickMultipleWindows(){
        clicklink("Multiple Windows");
        return new MultipleWindowspage(driver);
   }
    public Hoverspage clickhovers(){
        clicklink("Hovers");
        return new Hoverspage(driver);
    }
    public LargeAndDeepdom clicklargeanddeepdom(){
        clicklink("Large & Deep DOM");
        return new LargeAndDeepdom(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clicklink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public Entryadpage clickentryad(){
        clicklink("Entry Ad");
        return new Entryadpage(driver);
    }
    public Framespage clickFrames(){
        clicklink("Frames");
        return new Framespage(driver);
    }
    public Keypressespage clickkeypresses(){
        clicklink("Key Presses");
        return new Keypressespage(driver);
    }
    public DropdownPage clickdropdown(){
        clicklink("Dropdown");
        return new DropdownPage(driver);
    }
    public JavaScriptAlertspage clickJavaScriptAlerts(){
        clicklink("JavaScript Alerts");
        return new JavaScriptAlertspage(driver);
    }
    public FileUploadpage clickFileUpload(){
        clicklink("File Upload");
        return new FileUploadpage(driver);
    }
   public void clicklink(String linktext){
        driver.findElement(By.linkText(linktext)).click();
   }
//    public void scrolltotabbytoelementinhomepage(){
//        Actions actions= new Actions(driver);
//        actions.scrollToElement(driver.findElement(forgetpasswordlocator));
//
//    }
}
