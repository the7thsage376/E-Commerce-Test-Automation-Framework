package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.browserFactory;

import java.time.Duration;


public class baseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public void setup() {
        driver = browserFactory.startBrowser("Chrome","https://ndosisimplifiedautomation.vercel.app/#practice");
        wait = new WebDriverWait(driver,Duration.ofSeconds(2));

    }public void tearDown() {
        driver.quit();
    }
}
