package pages.actions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.SweetsPageLocators;
import utils.SeleniumDriver;
import utils.Utilities;

import java.io.IOException;

public class SweetsPageActions {
    SweetsPageLocators sweetsPageLocators = null;

    public SweetsPageActions() {
        sweetsPageLocators = new SweetsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), sweetsPageLocators);
    }

    public void verifyTitleOfProduct(String productName) throws IOException {
        Utilities.captureScreenshot("Verifying title of product");
        SeleniumDriver.verifyAssertEquality(
                sweetsPageLocators.chocolateCupTitle.getText(),
                productName
        );
    }

    public void verifyPriceOfProduct(String price) throws IOException {
        Utilities.captureScreenshot("Verifying price of product");
        SeleniumDriver.verifyAssertEquality(
                sweetsPageLocators.priceOfChocolateCups.getText(),
                price
        );
    }

    public void addProductToBasket(int count) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            sweetsPageLocators.addToBasketButtonForChocolateCup.click();
            Thread.sleep(1000);
        }
    }
}
