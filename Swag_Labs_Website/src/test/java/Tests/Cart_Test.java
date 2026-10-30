package Tests;

import Base.Basetests;
import Utils.DataDriven;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.*;

public class Cart_Test extends Basetests {
    @Test
    public void  Verify_Cart_Is_Empty()throws IOException {
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));
        var inventoryPage=loginPage.press_login_button();
      var cartpage = inventoryPage.clickoncarticon();
      assertTrue(cartpage.iscartempty(),"cart is not empty");
    }

    @Test
    public void Verify_Added_Products_In_Cart() throws IOException {
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));

        var inventoryPage = loginPage.press_login_button();

        List<String> products = DataDriven.getproducts();

        for (String product : products) {
            inventoryPage.add_product_to_cart(product);
        }

        var cartpage = inventoryPage.clickoncarticon();

        assertEquals(cartpage.get_cart_product_names(), products,
                "Incorrect products in cart");
    }

    @Test
    public void Verify_Remove_One_Product() throws IOException {

        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));

        var inventoryPage = loginPage.press_login_button();

        List<String> products = DataDriven.getproducts();

        for (String product : products) {
            inventoryPage.add_product_to_cart(product);
        }

        var cartpage = inventoryPage.clickoncarticon();

        assertEquals(cartpage.get_cart_product_names(), products,
                "Incorrect products in cart");

        cartpage.remove_product("Sauce Labs Bolt T-Shirt");

        getabsManger().goBack();

        assertEquals(
                inventoryPage.get_product_button_text("Sauce Labs Bolt T-Shirt"),
                "Add to cart"
        );

        for (String product : products) {
            if (!product.equals("Sauce Labs Bolt T-Shirt")) {
                assertEquals(
                        inventoryPage.get_product_button_text(product),
                        "Remove"
                );
            }
        }
    }
    @Test
    public void Verify_Cart_State_After_Logout_Login () throws IOException {
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));

        var inventoryPage = loginPage.press_login_button();
//        inventoryPage.dismissalert();
        List<String> products = DataDriven.getproducts();

        for (String product : products) {
            inventoryPage.add_product_to_cart(product);
        }
        inventoryPage.click_list();
        inventoryPage.click_logout_button();
        System.out.println("Logout clicked");
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));
        var inventoryPage2 = loginPage.press_login_button();
        var cartpage =inventoryPage2.clickoncarticon();
        assertEquals(cartpage.get_cart_product_names(), products,
                "Incorrect products in cart");
    }



}
