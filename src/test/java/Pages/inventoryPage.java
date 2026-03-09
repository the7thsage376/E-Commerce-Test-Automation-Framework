package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.time.Duration;


public class inventoryPage {
    WebDriver driver;
    WebDriverWait wait;

    public inventoryPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        PageFactory.initElements(driver,this);
    }

    // Device type button
    @FindBy(id = "deviceType")
    public WebElement typeButton;

    // Phone option selected
    @FindBy(css = "option[value='phone']")
    public WebElement phoneButton;

    // select brand button
    @FindBy(name = "brand")
    public WebElement selectButton;

    // select apple
    @FindBy(css = "option[value='apple']")
    public WebElement brandButton;

    // storage selection
    // verify that the Unit price R480.00 displayed.
    @FindBy(id = "storage-128GB")
    public WebElement storageButton;

    // select colour button
    @FindBy(id = "color")
    public WebElement pickColor;

    // select phone colour
    @FindBy(css = "option[value='blue']")
    public WebElement colourBlueButton;

    // select quantity,2
    // Apply equivalence partitioning as part of test

    @FindBy(xpath = "//input[@type='number']")
    public WebElement quantityButton;

    @FindBy(id = "address")
    public WebElement findAddress;

    // click next button
    // verify that invoice field is displayed maybe
    @FindBy(xpath = "//button[@type='submit']")

    public WebElement nextButton;


    // stops at clicking apple
    public void selectDeviceAndBrand() {

        wait.until(elementToBeClickable(typeButton)).click();

        // 3. Select Phone
        phoneButton.click();
        System.out.println("Clicked Phone");

        // 5. Click Brand Dropdown
        wait.until(elementToBeClickable(selectButton)).click();

        brandButton.click();
        System.out.println("Clicked Apple");
    }

    // selects storage, colour, quantity,delivery address and clicks next
    public void deviceSpecsAndAddress() {
        storageButton.click();
        wait.until(visibilityOf( pickColor)).click();
        colourBlueButton.click();
        quantityButton.clear();
        quantityButton.sendKeys("2");
        findAddress.sendKeys("123 Test Street");
        nextButton.click();
        System.out.println("Confirmed");
    }
    }












