package Base;

import Pages.HomePage;
import Utils.WindowManager;
import com.google.common.io.Files;
import listensers.MyListenser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
//    private By linkslocator = By .tagName("a");
//    private By inputlink= By.linkText("Inputs");
    @BeforeMethod
    public void setup() {
     driver=new ChromeDriver(getchromeoptions());
     driver.manage().window().maximize();
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverListener listener= new MyListenser();
        WebDriver decorated=new EventFiringDecorator<>(listener).decorate(driver);
        decorated.get("https://the-internet.herokuapp.com/");
     homePage = new HomePage(decorated);
//        System.out.println(driver.getTitle());
//        driver.manage().window().fullscreen();
//        driver.manage().window().maximize();
//        driver.manage().window().minimize();
//        driver.manage().window().setSize(new Dimension(430,932));
//          List<WebElement> links = driver.findElements(linkslocator);
//        System.out.println(" num of links is "+ links.size());
//        driver.findElement(inputlink).click();

    }
    public WindowManager getWindowManger(){
        return new WindowManager(driver);
    }
//    @AfterMethod
//public void teardown(){
//    driver.close();
//}
    @AfterMethod
    public void record_failure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            var cam = (TakesScreenshot)driver;
            File screenshot=cam.getScreenshotAs(OutputType.FILE);
            // System.out.println("screenshot taken at "+screenshot.getAbsolutePath());
            try {
                Files.move(screenshot,new File ("resourses/Screenshots1/"+result.getName()+".png"));
            } catch (IOException e) {
                (e).printStackTrace();
            }
        }

    }
    private ChromeOptions getchromeoptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        return options;
    }
}



