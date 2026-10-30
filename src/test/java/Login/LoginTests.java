package Login;

import Base.BaseTests;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void SuccessfulLogin(){
    var loginpage=homePage.clickformauthentication();
    loginpage.setusername("tomsmith");
    loginpage.setpassword("SuperSecretPassword!");
    var secureareapage =loginpage.clickloginbutton();
  String message =secureareapage.getmessage();
  assertTrue(message.contains("You logged into a secure area!"),"loser");
    }
//    @Test
//    public void testscrol(){
//        homePage.scrolltotabbytoelementinhomepage();
//    }
}
