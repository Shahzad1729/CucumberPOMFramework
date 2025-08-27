package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {

    @FindBy(how = How.ID, using = "exampleInputEmail")
    public WebElement emailAddressField;

    @FindBy(how = How.ID, using = "exampleInputPassword")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//form[@class='needs-validation']/button")
    public WebElement loginBtn;


    @FindBy(how = How.XPATH, using = "//h1[@class='display-3']")
    public WebElement yourAccountHeading;

    @FindBy(how = How.XPATH, using = "//p[@class='lead']/a")
    public WebElement loggedInUserName;
}
