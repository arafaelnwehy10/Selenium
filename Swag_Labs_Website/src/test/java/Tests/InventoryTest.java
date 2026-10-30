package Tests;

import Base.Basetests;
import Utils.DataDriven;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InventoryTest extends Basetests {
    @Test
    public void Verify_Inventory_PageElements_After_Login() throws IOException {
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));
        var inventoryPage=loginPage.press_login_button();
        String title =inventoryPage.get_page_title();
        assertEquals(title,"Swag Labs","incorrect title");
        assertTrue(inventoryPage.is_displayed_cart_icon(),"the cart icon is not displayed");
        assertEquals(inventoryPage.get_products_count(),6,"incorrect count");
    }

@Test
    public void Verify_Social_Links()throws IOException{
    loginPage.setusername(DataDriven.getData("validLogin", "username"));
    loginPage.setpassword(DataDriven.getData("validLogin", "password"));
    var inventoryPage=loginPage.press_login_button();
   var xswag= inventoryPage.click_on_x_icon();
    getabsManger().switchtotab("Sauce Labs (@saucelabs) / X");
    Assert.assertTrue(xswag.getcurrnturl().contains("x.com"),"\"you are in the wrong page\"");
    getabsManger().goTo("https://www.saucedemo.com/inventory.html");
    var fswag=inventoryPage.click_on_facebook_icon();
    getabsManger().switchtotab("Sauce Labs | Facebook1");
    fswag.clikcclosebutton();
    Assert.assertTrue(fswag.getcurrnturl().contains("facebook"),"\"you are in the wrong page\"");
    getabsManger().goTo("https://www.saucedemo.com/inventory.html");
    var lswag=inventoryPage.click_on_linkedin_icon();
    getabsManger().switchtotab("Sign Up | LinkedIn\n");
    Assert.assertTrue(lswag.getcurrnturl().contains("linkedin"),"\"you are in the wrong page\"");
   }
}

