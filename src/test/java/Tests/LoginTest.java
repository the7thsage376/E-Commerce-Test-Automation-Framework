package Tests;

import Base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.loginPage;
import Pages.inventoryPage;
import Pages.checkoutPage;
import Pages.invoicePage;

public class LoginTest extends baseTest {
    // declares all variables at the top of the test
    // So all classes can share them
    loginPage login;
    inventoryPage inventory;
    checkoutPage checkout;
    invoicePage invoice;

    @Test(priority = 1, description = "login to website")
        // 2. Initialize the LoginPage
            public void loginStep(){
            login = new loginPage(driver);
        inventory = login.loginToApp("tester@gmail.com", "@password123");

        // Asserting we're in
        Assert.assertTrue(inventory.typeButton.isDisplayed(),"Test failed to reach advanced page");

        }

    @Test( priority = 2, dependsOnMethods ="loginStep", description = "Complete inventory and checkout")

        public void siteCheckout() {

        inventory.selectDeviceAndBrand();
        inventory.deviceSpecsAndAddress();

        checkout = new checkoutPage(driver);
        checkout.checkoutFlow();
    }

    @Test(priority = 3,dependsOnMethods = "siteCheckout", description ="Verifies invoice")

            public void invoiceCheck() throws InterruptedException {
        invoice = new invoicePage(driver);
        invoice.invoiceVerification();
    }



    }
