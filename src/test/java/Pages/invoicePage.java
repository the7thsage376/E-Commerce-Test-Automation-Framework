package Pages;

import org.openqa.selenium.support.FindBy;

public class invoicePage {
    //click invoice button
    @FindBy(id = "#view-history-btn")
    webElement invoiceButton;

    // Locator for the invoice panel as a whole
    // select the first invoice that pops up
    @FindBy(id = "#invoice-history-panel")
    webElement invoicePanel;
}
