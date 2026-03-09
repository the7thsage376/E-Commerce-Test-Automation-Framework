package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
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

    @FindBy( xpath = "//*[contains(@id, 'view-invoice-INV')]")
    public WebElement viewInvoiceButton;

    public void invoiceVerification() throws InterruptedException{

        // wait for the invoice button to be displayed.
        // AI recommended. Useful for robustness
        // TestNG is too fast!
        wait.until(visibilityOf(invoiceButton));
        for (int i = 0; i < 5; i++) {
            try {
                invoiceButton.click();
                break; // If it clicks, we stop the loop and move on!
            } catch (org.openqa.selenium.ElementClickInterceptedException e) {
                // If something is blocking it, we wait 1 second and try again
                Thread.sleep(1000);
                System.out.println("Click blocked, retrying... " + (i + 1));
            }
        }

        // Check to see if the invoice panel is displayed
        wait.until(visibilityOf(invoicePanel));

        // click on the view button
        wait.until(elementToBeClickable(viewInvoiceButton)).click();


        System.out.println("Invoice verification is successful");
    }

}




