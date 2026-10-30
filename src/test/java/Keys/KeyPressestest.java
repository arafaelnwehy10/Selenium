package Keys;

import Base.BaseTests;
import Pages.Keypressespage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressestest extends BaseTests {
    @Test
    public void testkeys(){
       var Keypressespage = homePage.clickkeypresses();
       Keypressespage.settext(Keys.chord(Keys.SHIFT,"a"));
       assertEquals(Keypressespage.gettext(),"You entered: A","MESSAGE IS NOT CORRECT");
    }
}
