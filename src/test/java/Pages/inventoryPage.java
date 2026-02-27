package Pages;

import org.openqa.selenium.support.FindBy;

public class inventoryPage {

// learn button xpath
    @FindBy(xpath ="//button[contains(@class, 'nav-dropdown-trigger')]")
    webElement learnButton;

// learning materials
    @FindBy(xpath ="//span[text()='Learning Materials']")
    webElement learningMaterialButton;

//web automation advanced
    @FindBy( css = '[value="web"]')
    webElement advancedButton;


}
