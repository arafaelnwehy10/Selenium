package LargeAndDeepdom;

import Base.BaseTests;
import org.testng.annotations.Test;

public class LargeAndDeepDomtests extends BaseTests {
    @Test
    public void scrolingtest(){
       var scroling= homePage.clicklargeanddeepdom();
       scroling.scrolltotablebyamount();
    }
//    @Test
//    public void scrolingtest(){
//        var scroling= homePage.clicklargeanddeepdom();
//        scroling.scrolltotabbytoelement();
//    }
}
