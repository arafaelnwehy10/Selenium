package Waits;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Waitstests extends BaseTests {
    @Test
    public void testwaits(){
        var ex1page=homePage.clickDynamicLoading().click_link1();
        ex1page.click_start();
        assertEquals(ex1page.get_message(),"Hello World!","the message is not visible");
    }
    @Test
    public void testwaits2(){
        var ex2page=homePage.clickDynamicLoading().click_link2();
        ex2page.click_start2();
        assertEquals(ex2page.get_message(),"Hello World!","the message is not visible");
    }
}
