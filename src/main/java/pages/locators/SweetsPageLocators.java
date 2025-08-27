package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SweetsPageLocators {

    @FindBy(how= How.XPATH,using = "(//h4[@class='card-title'])[1]")
    public WebElement chocolateCupTitle;


    @FindBy(how=How.XPATH,using = "(//p[@class='card-text'])[1]")
    public WebElement candyChocolateCups;


    @FindBy(how = How.XPATH,using = "(//small[@class='text-muted'])[1]")
    public WebElement priceOfChocolateCups;


    @FindBy(how=How.XPATH,using="(//a[@class='btn btn-success btn-block addItem'])[1]")
    public WebElement addToBasketButtonForChocolateCup;

}
