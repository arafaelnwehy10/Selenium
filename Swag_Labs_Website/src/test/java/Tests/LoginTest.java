package Tests;

import Base.Basetests;
import Utils.DataDriven;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import static org.testng.Assert.assertEquals;

public class LoginTest extends Basetests {
    @Test
    public void Verify_Successful_Login() throws IOException {
        loginPage.setusername(DataDriven.getData("validLogin", "username"));
        loginPage.setpassword(DataDriven.getData("validLogin", "password"));
      var inventoryPage= loginPage.press_login_button();
      var word=inventoryPage.getproducts();
      assertEquals(word,"Products","you are in the wrong page");
      String url =loginPage.getcurrnturl();
        Assert.assertTrue(url.contains("/inventory.html"),"\"you are in the wrong page\"");
    }
    @Test
    public void Verify_Invalid_Login() throws IOException {
        loginPage.setusername(DataDriven.getData("invalidLogin", "username"));
        loginPage.setpassword(DataDriven.getData("invalidLogin", "password"));
        loginPage.press_login_button();
        assertEquals(loginPage.get_error_message(),
                "Epic sadface: Username and password do not match any user in this service",
                "wrong error message");
    }
    @Test
    public void  Verify_Login_Without_Password() throws IOException {
        loginPage.setusername(DataDriven.getData("loginWithoutPassword", "username"));
        loginPage.setpassword(DataDriven.getData("loginWithoutPassword", "password"));
        loginPage.press_login_button();
        assertEquals(loginPage.get_error_message(),
                "Epic sadface: Password is required",
                "wrong error message");
    }
}
