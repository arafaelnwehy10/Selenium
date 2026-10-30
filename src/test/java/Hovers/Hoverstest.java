package Hovers;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Hoverstest extends BaseTests {
    @Test
    public void testhovers(){
        var hoverspage =homePage.clickhovers();
        int index=1;
        var figurecaption=hoverspage.hoveroverfigure(index);
        assertTrue(figurecaption.iscaptiondisplayed(),"the caption is not displayed");
        assertEquals(figurecaption.getname(),"name: user"+index,"name is not correct");
        assertEquals(figurecaption.getlink(),"View profile","the link text is not correct");
        assertTrue(figurecaption.getlinkurl().contains("/users/"+index),"the link url is not correct");
    }
}
