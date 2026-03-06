package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {
    WebDriver driver;
    WebDriverWait wait;

    public loginPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        PageFactory.initElements(driver,this);
    }
    // First login button
    @FindBy(xpath ="//button[span[text()='Login']]")
    public WebElement login;

    // login email text field
    @FindBy(name ="loginEmail")
    public WebElement loginEmail;

    // login password text field
    @FindBy(id ="login-password")
    public WebElement LoginPassword;

    @FindBy(id ="login-submit" )
    public WebElement loginButton;

    // learn button xpath
    @FindBy(xpath ="//button[contains(@class, 'nav-dropdown-trigger')]")
    public WebElement learnButton;

    // learning materials
    @FindBy(xpath ="//span[text()='Learning Materials']")
    public WebElement learningMaterialButton;

    //web automation advanced
    @FindBy( css = "[value='web']")
    public WebElement advancedButton;

    public inventoryPage loginToApp(String email, String password) {
        // 1. Open the Login Modal and sign in
        login.click();
        loginEmail.sendKeys(email);
        LoginPassword.sendKeys(password);
        loginButton.click();

        try {
            Thread.sleep(2000); // 2000ms = 2 seconds to let the page settle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Navigate the Dropdowns to get to the Practice area
        learnButton.click();           // Clicks the dropdown trigger
        learningMaterialButton.click(); // Selects Learning Materials
        advancedButton.click();         // Selects Web Automation Advanced

        // 3. Now that we are on the actual practice page, we return the Inventory Page
        return new inventoryPage(driver);
    }

    }



