package Navigate;

import Base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().click_link1();
        getWindowManger().goBack();
        getWindowManger().goForward();
        getWindowManger().refresh();
        getWindowManger().goTo("https://www.google.com/");
    }
}
