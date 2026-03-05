package Tests;

import Base.baseTest;
import org.testng.annotations.Test;
import Pages.loginPage;
import Pages.inventoryPage;

public class loginTest extends baseTest {

    @Test
    // You MUST add 'throws InterruptedException' here because inventoryPage uses Thread.sleep
    public void verifyCompleteNavigationToAdvancedSection() throws InterruptedException {
        // 1. Launch the browser and navigate (handled by baseTest)
        setup();

        // 2. Initialize the LoginPage
        loginPage login = new loginPage(driver);

        // 3. Login and Navigate (Returns inventoryPage)
        // If loginToApp also uses Thread.sleep, it will also need 'throws' in its own class
        inventoryPage inventory = login.loginToApp("tester@gmail.com", "@password123");

        // 4. Validation & Action
        if (inventory.typeButton.isDisplayed()) {
            System.out.println("Success! We reached the Advanced Web Automation page.");

            // MODIFIED STEP: Using your new method with the built-in delays
            inventory.selectDeviceAndBrand();

            System.out.println("Flow complete: Phone and Apple selected visually.");
        }

        // 5. Close browser
        // tearDown();
    }
}