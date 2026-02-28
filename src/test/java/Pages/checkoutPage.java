package Pages;

import org.openqa.selenium.support.FindBy;

public class checkoutPage {

    // express button
    @FindBy(id = "#shipping-option-express")
    webElement shippingButton;

    // warranty button
    @FindBy(id = "#warranty-option-1yr")
    webElement warrantyButton;

    // Discount button
    // send keys for the discount code
    @FindBy(xpath = "//input[@type='text']")
    webElement discountField;

    // confirm purchase button
    @FindBy(id = "#purchase-device-btn")
    webElement purchaseButton

}
