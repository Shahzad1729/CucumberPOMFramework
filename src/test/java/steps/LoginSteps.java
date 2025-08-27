package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.actions.LoginPageActions;
import pages.actions.NavigationMenuActions;
import utils.SeleniumDriver;

public class LoginSteps {

    NavigationMenuActions navigationMenuActions = new NavigationMenuActions();
    LoginPageActions loginPageActions = new LoginPageActions();

    @Given("User navigates to {string} Sweet Shop website")
    public void user_navigates_to_sweet_shop_website(String url) {
        SeleniumDriver.openPage(url);
    }

    @Then("User validates page title as {string}")
    public void user_validates_page_title(String title) {
        Assert.assertEquals(navigationMenuActions.getSweetsShopTitle(),
                title);
    }

    @And("User go to login screen")
    public void user_go_to_login_screen() {
        navigationMenuActions.goToLoginPage();
    }

    @And("User enters valid username as {string}")
    public void user_enters_valid_username(String username) {
        loginPageActions.enterEmail(username);
    }

    @And("User enters valid password as {string}")
    public void user_enters_valid_password(String password) {
        loginPageActions.enterPassword(password);
    }

    @And("Click on login button")
    public void click_on_login_button() {
        loginPageActions.clickOnLoginButton();
    }

    @Then("User verify logged in user {string}")
    public void user_verify_login_is_successful_or_not(String loggedInUser) {
        Assert.assertEquals(loginPageActions.getLoggedInUserName(),
                loggedInUser);
    }

}
