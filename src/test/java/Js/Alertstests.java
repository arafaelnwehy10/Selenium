package Js;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Alertstests extends BaseTests {
    @Test
    public void testalert(){
        var js=homePage.clickJavaScriptAlerts();
        js.clickalert();
        assertEquals(js.getmessagealert(),"I am a JS Alert","message not correct");
        js.acceptalert();
        assertEquals(js.getmessage(),"You successfully clicked an alert","message not correct");
    }
    @Test
    public void testconfirm(){
        var js=homePage.clickJavaScriptAlerts();
        js.clickcofirm();
        assertEquals(js.getmessagealert(),"I am a JS Confirm","message not correct");
        js.dismissalert();
        assertEquals(js.getmessage(),"You clicked: Cancel","message not correct");
    }
    @Test
    public void testprompt(){
        var js=homePage.clickJavaScriptAlerts();
        js.clickprompt();
        assertEquals(js.getmessagealert(),"I am a JS prompt","message not correct");
        js.setprompttext("arafa");
        js.acceptalert();
        assertEquals(js.getmessage(),"You entered: arafa","message not correct");
    }
}
