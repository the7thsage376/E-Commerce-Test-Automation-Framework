package Tests;

import Base.baseTest;
import org.testng.annotations.Test;
import Pages.loginPage;
import Pages.inventoryPage;
import Pages.checkoutPage;
import Pages.invoicePage;

public class loginTest extends baseTest {

    @Test

    public void verifyCompleteNavigationToAdvancedSection() throws InterruptedException {

        setup();

        // 2. Initialize the LoginPage
        loginPage login = new loginPage(driver);
        inventoryPage inventory = login.loginToApp("tester@gmail.com", "@password123");
        checkoutPage checkout = new checkoutPage(driver);
        invoicePage invoice = new invoicePage(driver);

        // 3. Login and Navigate (Returns inventoryPage)
        // If loginToApp also uses Thread.sleep, it will also need 'throws' in its own class


        // validated that we reached the web automation advanced page
        if (inventory.typeButton.isDisplayed()) {
            System.out.println("Success! We reached the Advanced Web Automation page.");

            // MODIFIED STEP: Using your new method with the built-in delays
            inventory.selectDeviceAndBrand();

            System.out.println("Flow complete: Phone and Apple selected visually.");
        }
        // Device specifications
        inventory.deviceSpecsAndAddress();

        // checkout flow
        checkout.checkoutFlow();

        //invoice verification flow
        invoice.invoiceVerification();


        // 5. Close browser
        // tearDown();
    }
}