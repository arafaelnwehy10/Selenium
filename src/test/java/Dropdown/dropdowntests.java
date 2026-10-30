package Dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class dropdowntests extends BaseTests {
    @Test
    public void testdropdown(){
        var dropdownpage = homePage.clickdropdown();
        String option="Option 1";
        dropdownpage.selectfromdropdown(option);
        List<String> selectedoptions=dropdownpage.getselectedoptions();
        assertEquals(selectedoptions.size(),1,"loser");
        assertTrue(selectedoptions.contains(option),"loser");
    }
}
