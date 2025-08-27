package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.actions.BasketPageActions;
import pages.actions.NavigationMenuActions;
import pages.actions.SweetsPageActions;
import utils.SeleniumDriver;
import utils.Utilities;

import java.io.IOException;

public class AddDeleteItemBasketSteps {
    NavigationMenuActions navigationMenuActions = new NavigationMenuActions();
    SweetsPageActions sweetsPageActions = new SweetsPageActions();
    BasketPageActions basketPageActions = new BasketPageActions();

    @Then("User clicks on Sweets tab")
    public void user_clicks_on_sweets_tab() throws IOException {
        navigationMenuActions.goToSweetsPage();
    }

    @Then("User validates the price of each {string} as {string}")
    public void user_validates_the_price_of_each_as(String productName, String price) throws IOException {
        sweetsPageActions.verifyTitleOfProduct(productName);
        sweetsPageActions.verifyPriceOfProduct(price);
    }

    @Then("User clicks on add to basket button {string} times")
    public void user_clicks_on_add_to_basket_button_times(String noOfItemToAdd) throws InterruptedException {
        SeleniumDriver.scrollByPixel(0, 300);
        sweetsPageActions.addProductToBasket(
                Integer.parseInt(noOfItemToAdd)
        );
    }

    @Then("User verify basket count for {string} {string}")
    public void user_verify_basket_count_for(String basketCount, String productName) throws IOException {
        SeleniumDriver.scrollByPixel(0, -300);
        Utilities.captureScreenshot("Verifying Basket count");
        SeleniumDriver.verifyAssertEquality(
                navigationMenuActions.getBasketCount(),
                basketCount
        );
    }

    @Then("User clicks on Basket tab")
    public void user_clicks_on_basket_tab() throws IOException {
        navigationMenuActions.goToBasketPage();
    }

    @Then("User verify the product name is correct as {string}")
    public void user_verify_the_product_name_is_correct_as(String productName) throws IOException {
        Utilities.captureScreenshot("Verifying details on Basket Page");
        SeleniumDriver.verifyAssertEquality(
                basketPageActions.getItemNameOnBasket(),
                productName
        );
    }

    @Then("User verify the price of each product is correct as {string}")
    public void user_verify_the_price_of_each_product_is_correct_as(String price) {
        SeleniumDriver.verifyAssertEquality(
                basketPageActions.getPriceOfEachItem(),
                price
        );
    }

    @Then("User verify the total count of product added as {string}")
    public void user_verify_the_total_count_of_product_added_as(String totalCount) {
        SeleniumDriver.verifyAssertEquality(
                basketPageActions.getTotalCountOfItems(),
                totalCount
        );
    }

    @Then("User verify the total amount of {string} products")
    public void user_verify_the_total_amount_of_products(String totalCount) {
        String priceOfEachItem = basketPageActions.getPriceOfEachItem();
        String subStr = priceOfEachItem.substring(1, 2);

        int priceInt = Integer.parseInt(subStr);
        int totalPrice = priceInt * Integer.parseInt(totalCount);

        String totalPriceOfItems = priceOfEachItem.replace(subStr,
                String.valueOf(totalPrice));

        SeleniumDriver.verifyAssertEquality(
                basketPageActions.getTotalPrice(),
                totalPriceOfItems
        );
    }

    @Then("User clicks on Delete Item and Clicks on Ok button on alert")
    public void user_clicks_on_delete_item_and_clicks_on_ok_button_on_alert() throws InterruptedException {
        basketPageActions.clickOnDeleteItemButton();
        basketPageActions.switchToAlertAndClickOnOk();
    }
}