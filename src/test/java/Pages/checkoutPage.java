package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class checkoutPage {
    WebDriver driver;
    WebDriverWait wait;
    public checkoutPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

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

    // apply discount buton
    @FindBy (id = "apply-discount-btn")
    WebElement applyDiscountButton;

    // confirm purchase button
    @FindBy(id = "purchase-device-btn")
    WebElement purchaseButton;

    public void checkoutFlow(){
        shippingButton.click();
        warrantyButton.click();
        discountField.sendKeys("SAVE10");
        applyDiscountButton.click();
        purchaseButton.click();
        System.out.println("Check out flow is successful");
    }

}





