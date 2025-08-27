package pages.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import pages.locators.BasketPageLocators;
import utils.SeleniumDriver;

public class BasketPageActions {

    BasketPageLocators basketPageLocators = null;

    public BasketPageActions() {
        basketPageLocators = new BasketPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), basketPageLocators);
    }

    public String getItemNameOnBasket() {
        return basketPageLocators.itemNameOnBasket.getText();
    }

    public String getPriceOfEachItem() {
        return basketPageLocators.priceOfEachItemOnBasket.getText();
    }

    public String getTotalCountOfItems() {
        return basketPageLocators.totalItemCount.getText();
    }

    public String getTotalPrice() {
        return basketPageLocators.totalPrice.getText();
    }

    public void clickOnDeleteItemButton() {
        basketPageLocators.deleteItemBtn.click();
    }

    public void switchToAlertAndClickOnOk() throws InterruptedException {
        Alert alert = SeleniumDriver.getDriver().switchTo().alert();
        alert.accept();
        Thread.sleep(10000);
    }

    public void switchToAlertAndClickOnCancel() throws InterruptedException {
        Alert alert = SeleniumDriver.getDriver().switchTo().alert();
        alert.dismiss();
        Thread.sleep(10000);
    }

}
