package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Hoverspage {
    private WebDriver driver;
    private By figureboxes=By.cssSelector(".figure");
    private By figurecaption=By.cssSelector(".figcaption");

    public Hoverspage(WebDriver driver){
       this.driver=driver;
    }

public figurecaption hoveroverfigure (int index){
    Actions actions=new Actions(driver);
    WebElement figure = driver.findElements(figureboxes).get(index-1);
    actions.moveToElement(figure).perform();
    return new figurecaption(figure.findElement(figurecaption));
    }
    public class figurecaption{
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");
        public figurecaption(WebElement caption){
            this.caption=caption;
        }
        public boolean iscaptiondisplayed(){
            return caption.isDisplayed();
        }
        public String getname(){
            return caption.findElement(name).getText();
        }
        public String getlink(){
            return caption.findElement(link).getText();
        }
        public String getlinkurl(){
            return caption.findElement(link).getAttribute("href");
        }
    }
    
}
