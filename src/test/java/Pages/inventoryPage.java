package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class inventoryPage {
    WebDriver driver;

    public inventoryPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
    // Device type button
    @FindBy(id = "deviceType")
    public WebElement typeButton;

    // Phone option selected
    @FindBy(css = "option[value='phone']")
    public WebElement phoneButton;

    // select brand button
    @FindBy(name = "[name='brand']")
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
    public WebElement colourButton;

// select quantity,2
// Apply equivalence partitioning as part of test

    @FindBy(xpath = "//input[@type='number']")
    public WebElement quantityButton;

    // Write down address
// send keys for address
    @FindBy(id = "address")
    public WebElement findAddress;

    // click next button
// verify that invoice field is displayed maybe
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement nextButton;

    // This method handles the "Communication" to the next step
    public void selectDeviceType() {
        typeButton.click();
        phoneButton.click();



    }
    public void selectDeviceAndBrand() throws InterruptedException {
        // 1. Pause so you can see the page is loaded
        Thread.sleep(2000);

        // 2. Click Device Type Dropdown
        typeButton.click();
        Thread.sleep(1000); // Wait 1 second to see it open

        // 3. Select Phone
        phoneButton.click();
        System.out.println("Clicked Phone");

        // 4. Wait 1 second before Brand selection
        Thread.sleep(1000);

        // 5. Click Brand Dropdown
        selectButton.click();
        Thread.sleep(1000); // Wait 1 second to see it open

        // 6. Select Apple
        brandButton.click();
        System.out.println("Clicked Apple");
    }
    }










