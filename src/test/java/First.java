import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First {
    WebDriver driver = Driver.getDriver();
    GooglePage googlePage = new GooglePage();
    @BeforeClass
    public void setup() {
        Driver.getDriver();
    }
    @Test
    public void first() {
        googlePage.openGooglePage();
       googlePage.useSearch();
        Assert.assertEquals( driver.getCurrentUrl().contains("selenium"),true);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
