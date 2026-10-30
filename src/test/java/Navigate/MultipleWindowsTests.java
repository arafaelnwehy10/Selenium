package Navigate;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultipleWindowsTests extends BaseTests {
    @Test
    public void switchtotabtest(){
        var newwindowpage=homePage.clickMultipleWindows().clickonbutton();
        getWindowManger().switchtotab("New Window");
       String header= newwindowpage.gettext();
        assertEquals(header,"New Window","your are in the wrong page");
    }
}
