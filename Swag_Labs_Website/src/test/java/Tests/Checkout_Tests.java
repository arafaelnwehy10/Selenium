package Tests;

import Base.Basetests;
import Utils.DataDriven;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Checkout_Tests extends Basetests {
    @Test
    public void  Checkout_With_an_Empty_Cart()throws IOException {
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));
        var inventoryPage = loginPage.press_login_button();
        var cart= inventoryPage.clickoncarticon();
        var checkoutpage=cart.click_on_checkout_button();
        Assert.assertFalse(checkoutpage.isCheckoutPageDisplayed());

    }
}
