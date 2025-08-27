package pages.actions;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;
import utils.Utilities;

import java.io.IOException;

public class LoginPageActions {

    LoginPageLocators loginPageLocators = null;

    public LoginPageActions() {
        loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
    }

    public void enterEmail(String email) {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Enter username as: "+email);
        loginPageLocators.emailAddressField.sendKeys(email);
    }

    public void enterPassword(String password) {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Enter password as: "+password);
        loginPageLocators.passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Clicking on Login button");
        loginPageLocators.loginBtn.click();
    }

    public String getLoggedInUserName() throws IOException {
        Utilities.captureScreenshot("Getting logged in username");
        return loginPageLocators.loggedInUserName.getText();
    }

    public String getHeadingAfterLogin() {
        return loginPageLocators.yourAccountHeading.getText();
    }
}
