import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;
public class Driver {

    private static WebDriver driver= null;
    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "d://programs//chromedriver.exe");
            driver = ThreadGuard.protect(new ChromeDriver());
        }
        return driver;
    }
}
