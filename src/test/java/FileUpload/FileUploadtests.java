package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadtests extends BaseTests {
    @Test
    public void FileUploadtests(){
        String absolutepath="C:\\Users\\User\\IdeaProjects\\C5Selenium\\resourses\\eee.txt";
        var fileupload=homePage.clickFileUpload();
        fileupload.uploadfile(absolutepath);
        fileupload.clickuploadbutton();
      assertEquals(fileupload.getuploadedfilename(),"eee.txt","file name is not correct");
    }

}
