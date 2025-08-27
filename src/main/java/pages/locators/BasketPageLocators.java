package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasketPageLocators {

    @FindBy(how = How.CSS, using = "#basketItems > li.list-group-item.d-flex.justify-content-between.lh-condensed > div > h6\n")
    public WebElement itemNameOnBasket;

    @FindBy(how = How.CSS, using = "#basketItems > li.list-group-item.d-flex.justify-content-between.lh-condensed > span")
    public WebElement priceOfEachItemOnBasket;

    @FindBy(how = How.CSS, using = "#basketCount")
    public WebElement totalItemCount;

    @FindBy(how = How.CSS, using = "#basketItems > li:nth-child(2) > strong")
    public WebElement totalPrice;

    @FindBy(how = How.CSS, using = "#basketItems > li.list-group-item.d-flex.justify-content-between.lh-condensed > div > a")
    public WebElement deleteItemBtn;

}
