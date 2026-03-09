package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;  // MISSING IMPORT
import org.testng.annotations.BeforeClass; // MISSING IMPORT
import utilities.browserFactory;
import java.time.Duration;

public class baseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass // Tells TestNG to run this BEFORE your tests start
    public void setup() {
        driver = browserFactory.startBrowser("Chrome", "https://ndosisimplifiedautomation.vercel.app/#practice");
        // Pro-tip: 2 seconds is very short for an E2E flow; 10s is safer for slow networks
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass(alwaysRun = true) // Tells TestNG to run this AFTER all tests finish
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}