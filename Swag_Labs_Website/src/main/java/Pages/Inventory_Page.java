package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Inventory_Page {
    private WebDriver driver;
    private By Products_loctor =By.className("title");
    private By  page_title_loctor =By.className("app_logo");
    private By  cart_icon_loctor =By.className("shopping_cart_link");
    private By  products_loctor =By.className("inventory_item");
    private By linkedin_icon_locator= By .partialLinkText("LinkedIn");
    private By facebook_icon_locator= By .partialLinkText("Facebook");
    private By x_icon_locator= By .partialLinkText("X");
    private By product_name_locator = By.className("inventory_item_name");
    private By add_to_cart_button_locator = By.xpath(".//button");
    private By list_locator= By .id("react-burger-menu-btn");
    private By logout_button_locator= By.id("logout_sidebar_link");
    public Inventory_Page(WebDriver driver){
        this.driver=driver;
    }
    public String getproducts(){
      return   driver.findElement(Products_loctor).getText();
    }
    public String get_page_title(){
    return     driver.findElement(page_title_loctor).getText();
    }
    public boolean is_displayed_cart_icon(){
        return driver.findElement(cart_icon_loctor).isDisplayed();
    }
    public int get_products_count() {
        return driver.findElements(products_loctor).size();
    }
    public X_swaglabs_page click_on_x_icon(){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(50, 500).perform();
        driver.findElement(x_icon_locator).click();
        return new X_swaglabs_page(driver);
    }
    public Facebook_swaglabs_page click_on_facebook_icon(){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(50, 500).perform();
        driver.findElement(facebook_icon_locator).click();
        return new Facebook_swaglabs_page(driver);
    }
    public Linkedin_swaglabs_page click_on_linkedin_icon(){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(50, 500).perform();
        driver.findElement(linkedin_icon_locator).click();
        return new Linkedin_swaglabs_page(driver);
    }
    public Cart_page clickoncarticon(){
        driver.findElement(cart_icon_loctor).click();
        return new Cart_page(driver);
    }
    public void add_product_to_cart(String productName) {

        for (WebElement product : driver.findElements(products_loctor)) {

            String name = product.findElement(product_name_locator).getText();

            if (name.equals(productName)) {
                product.findElement(add_to_cart_button_locator).click();
                break;
            }
        }
    }

    public String get_product_button_text(String productName) {

        for (WebElement product : driver.findElements(products_loctor)) {

            String name = product.findElement(product_name_locator).getText();

            if (name.equals(productName)) {
                return product.findElement(add_to_cart_button_locator).getText();
            }
        }

        return null;
    }
    public void click_list (){
        driver.findElement(list_locator).click();
    }
   public Login_Page click_logout_button (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(logout_button_locator));
        driver.findElement(logout_button_locator).click();
        return new Login_Page(driver);
    }
    public void dismissalert(){
        driver.switchTo().alert().dismiss();
    }
    public void acceptalert(){
        driver.switchTo().alert().accept();
    }



}
