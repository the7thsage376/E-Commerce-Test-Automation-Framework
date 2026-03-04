package Base;

import org.openqa.selenium.WebDriver;
import utilities.browserFactory;

public class baseTest {
    public WebDriver driver;

    public void setup() {
        driver = browserFactory.startBrowser("Chrome","https://ndosisimplifiedautomation.vercel.app/#practice");

    }public void tearDown() {
        driver.quit();
    }
}
