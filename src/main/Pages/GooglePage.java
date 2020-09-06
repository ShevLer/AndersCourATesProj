import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    WebDriver driver = Driver.getDriver();
    @Step
    public void openGooglePage() {
        driver.get("https://www.google.com/");
    }
    @Step
    public void useSearch() {
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).submit();
    }

}
