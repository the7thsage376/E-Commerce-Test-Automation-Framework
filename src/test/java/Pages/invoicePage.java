package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class invoicePage {
    WebDriver driver;
    WebDriverWait wait;

    public invoicePage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        PageFactory.initElements(driver,this);
    }
    //click invoice button
    @FindBy(id = "view-history-btn")
    WebElement invoiceButton;

    // Locator for the invoice panel as a whole
    // select the first invoice that pops up
    @FindBy(id = "invoice-history-panel")
    WebElement invoicePanel;

    public void invoiceVerification() throws InterruptedException{
        Thread.sleep(2000);
        invoiceButton.click();
        invoicePanel.click();
        System.out.println("Invoice verification is successful");
    }

}




