package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadpage {
    private WebDriver driver;
    private By chossebuttonlocator=By.id("file-upload");
    private By uploadbuttonlocator=By.id("file-submit");
    private By uploaedfielslocator=By.id("uploaded-files");

    public FileUploadpage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadfile(String filepath){
        driver.findElement(chossebuttonlocator).sendKeys(filepath);
    }
    public void clickuploadbutton(){
        driver.findElement(uploadbuttonlocator).click();
    }
    public String getuploadedfilename(){
      return driver.findElement(uploaedfielslocator).getText();
    }

}
