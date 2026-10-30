package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.ArrayList;


public class Cart_page {
    private WebDriver driver;
    public Cart_page(WebDriver driver){
        this.driver=driver;
    }
    private By cartlistlocator=By.className("cart_item");
    private By cart_product_names_locator = By.className("inventory_item_name");
    private By cart_item_locator = By.className("cart_item");
    private By remove_button_locator = By.xpath(".//button");
    private By checkout_button_locator= By.id("checkout");
    public Boolean iscartempty(){
      return  driver.findElements(cartlistlocator).isEmpty();
    }

    public List<String> get_cart_product_names() {
        List<String> productNames = new ArrayList<>();

        for (WebElement product : driver.findElements(cart_product_names_locator)) {
            productNames.add(product.getText());
        }

        return productNames;
    }
    public void remove_product(String productName) {
        for (WebElement product : driver.findElements(cart_item_locator))
        { String name = product.findElement(cart_product_names_locator).getText();
            if (name.equals(productName)) { product.findElement(remove_button_locator).click(); break; }
        }
    }
    public Checkout_page click_on_checkout_button(){
        driver.findElement(checkout_button_locator).click();
        return new Checkout_page(driver);
    }

}
