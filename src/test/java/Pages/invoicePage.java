package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invoicePage {
    WebDriver driver;

    public invoicePage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
    //click invoice button
    @FindBy(id = "view-history-btn")
    WebElement invoiceButton;

    // Locator for the invoice panel as a whole
    // select the first invoice that pops up
    @FindBy(id = "invoice-history-panel")
    WebElement invoicePanel;

}




