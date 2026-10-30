package Base;

import Pages.Login_Page;
import Utils.Tabs_manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Basetests {
    private WebDriver driver;
    protected Login_Page loginPage;
    @BeforeMethod
    public void Setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new Login_Page(driver);
    }
    public Tabs_manager getabsManger(){
        return new Tabs_manager(driver);
    }
//    @AfterMethod
//    public void Teardown(){
//        driver.close();
//    }
}
