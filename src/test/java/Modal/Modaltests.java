package Modal;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Modaltests extends BaseTests {
    @Test
    public void Modaltest(){
        var entryad=homePage.clickentryad();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryad.clickclose();
        assertEquals(entryad.getentryadtext(),"Entry Ad","wrong text");
    }

}
