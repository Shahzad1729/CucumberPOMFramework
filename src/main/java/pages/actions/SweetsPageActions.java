package pages.actions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.SweetsPageLocators;
import utils.SeleniumDriver;

public class SweetsPageActions {
    SweetsPageLocators sweetsPageLocators = null;

    public SweetsPageActions() {
        sweetsPageLocators = new SweetsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), sweetsPageLocators);
    }

    public void verifyTitleOfProduct(String productName) {
        Assert.assertEquals(
                sweetsPageLocators.chocolateCupTitle.getText(),
                productName
        );
    }

    public void verifyPriceOfProduct(String price) {
        Assert.assertEquals(
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
