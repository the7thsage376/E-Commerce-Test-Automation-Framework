package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
    WebDriver driver;

    public checkoutPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);

    }
    // express button
    @FindBy(id = "shipping-option-express")
    WebElement shippingButton;

    // warranty button
    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyButton;

    // Discount button
    // send keys for the discount code
    @FindBy(xpath = "//input[@type='text']")
    WebElement discountField;

    // confirm purchase button
    @FindBy(id = "purchase-device-btn")
    WebElement purchaseButton;

}





