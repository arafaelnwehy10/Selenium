package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Framestests extends BaseTests {
    @Test
    public void framestest(){
        var frames=homePage.clickFrames().clicknestedframes();
//        frames.clicknestedframes();
       assertTrue(frames.getleftframetext().contains("LEFT"),"the Left text is incorrect");
        assertTrue(frames.getbottomframetext().contains("BOTTOM"),"the Bottom text is incorrect");
    }
}
