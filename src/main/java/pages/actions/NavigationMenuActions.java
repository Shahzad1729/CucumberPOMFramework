package pages.actions;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.PageFactory;
import pages.locators.NavigationMenuLocators;
import utils.SeleniumDriver;

public class NavigationMenuActions {

    NavigationMenuLocators navigationMenuLocators = null;

    public NavigationMenuActions() {
        navigationMenuLocators = new NavigationMenuLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), navigationMenuLocators);
    }

    public void goToSweetsPage() {
        navigationMenuLocators.sweetsTab.click();
    }

    public void goToAboutPage() {
        navigationMenuLocators.aboutTab.click();
    }

    public void goToLoginPage() {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Going to Login Page");
        navigationMenuLocators.loginTab.click();
    }

    public void goToBasketPage() {
        navigationMenuLocators.basketTab.click();
    }

    public String getBasketCount() {
        return navigationMenuLocators.basketCount.getText();
    }

    public String getSweetsShopTitle() {
        SeleniumDriver.getExtentTest().log(Status.INFO,"Getting Sweets Shop Title");
        return navigationMenuLocators.sweetShopTitle.getText();
    }
}
