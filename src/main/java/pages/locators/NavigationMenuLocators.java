package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavigationMenuLocators {

    @FindBy(how = How.XPATH, using = "//a[@class='navbar-brand']")
    public WebElement sweetShopTitle;

    @FindBy(how = How.LINK_TEXT, using = "Sweets")
    public WebElement sweetsTab;

    @FindBy(how = How.LINK_TEXT, using = "About")
    public WebElement aboutTab;

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement loginTab;

    @FindBy(how = How.XPATH, using = "//*[@id='navbarColor01']/ul/li[4]/a")
    public WebElement basketTab;

    @FindBy(how = How.XPATH, using = "//span[@class='badge badge-success']")
    public WebElement basketCount;

}
