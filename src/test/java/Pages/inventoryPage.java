package Pages;

import org.openqa.selenium.support.FindBy;

public class inventoryPage {

// Device type button
    @FindBy(id = "#deviceType")
    webElement typeButton;

// Phone option selected
    @FindBy(css = "option[value='phone']")
    webElement phoneButton;

// select brand button
    @FindBy(name = "[name='brand']")
    webElement selectButton;

// select apple
    @FindBy(css = "option[value='apple']")
    webElement brandButton;

// storage selection
// verify that the Unit price R480.00 displayed.
    @FindBy(id = "#storage-128GB")
    webElement storageButton;

// select colour button
    @FindBy(id = "#color")
    webElement pickColor;

// select phone colour
    @FindBy(css = "option[value='blue']")
    webElement colourButton;

// select quantity,2
// Apply equivalence partitioning as part of test

    @FindBy(xpath = "//input[@type='number']")
    webElement quantityButton;

// Write down address
// send keys for address
    @FindBy(id = "#address")
    webElement findAddress;

// click next button
// verify that invoice field is displayed maybe
    @FindBy(xpath = "//button[@type='submit']")
    webElement nextButton;




}
