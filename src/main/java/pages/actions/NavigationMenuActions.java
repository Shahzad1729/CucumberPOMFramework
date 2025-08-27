package pages.actions;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.PageFactory;
import pages.locators.NavigationMenuLocators;
import utils.SeleniumDriver;
import utils.Utilities;

import java.io.IOException;

public class NavigationMenuActions {

    NavigationMenuLocators navigationMenuLocators = null;

    public NavigationMenuActions() {
        navigationMenuLocators = new NavigationMenuLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), navigationMenuLocators);
    }

    public void goToSweetsPage() throws IOException {
        navigationMenuLocators.sweetsTab.click();
        Utilities.captureScreenshot("Sweets Page");
    }

    public void goToAboutPage() throws IOException {
        navigationMenuLocators.aboutTab.click();
        Utilities.captureScreenshot("About Page");
    }

    public void goToLoginPage() throws IOException {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Going to Login Page");
        navigationMenuLocators.loginTab.click();
        Utilities.captureScreenshot("Login Page");
    }

    public void goToBasketPage() throws IOException {
        navigationMenuLocators.basketTab.click();
        Utilities.captureScreenshot("Basket Page");
    }

    public String getBasketCount() {
        return navigationMenuLocators.basketCount.getText();
    }

    public String getSweetsShopTitle() {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Getting Sweets Shop Title");
        return navigationMenuLocators.sweetShopTitle.getText();
    }
}
