package Pages;

import org.openqa.selenium.support.FindBy;



public class loginPage {

    // First login button
    @FindBy(xpath ="//button[span[text()='Login']]")
    webElement login;

    // login email text field
    @FindBy(name ="loginEmail")
    webElement loginEmail;

    // login password text field
    @findBy(id ="login-password")
    webElement LoginPassword;

    @FindBy(id ="login-submit" )
    webElement loginButton;

    // Figure out how to click buttons and stuff during the weekend

}
