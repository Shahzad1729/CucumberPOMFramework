package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.actions.LoginPageActions;
import pages.actions.NavigationMenuActions;
import utils.SeleniumDriver;
import utils.Utilities;

import java.io.IOException;

public class LoginSteps {

    NavigationMenuActions navigationMenuActions = new NavigationMenuActions();
    LoginPageActions loginPageActions = new LoginPageActions();

    @Given("User navigates to {string} Sweet Shop website")
    public void user_navigates_to_sweet_shop_website(String url) throws IOException {
        SeleniumDriver.openPage(url);
        Utilities.captureScreenshot("Navigated to :"+url);
    }

    @Then("User validates page title as {string}")
    public void user_validates_page_title(String title) {
        SeleniumDriver.verifyAssertEquality(navigationMenuActions.getSweetsShopTitle(),
                title);
    }

    @And("User go to login screen")
    public void user_go_to_login_screen() throws IOException {
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
    public void user_verify_login_is_successful_or_not(String loggedInUser) throws IOException {
        SeleniumDriver.verifyAssertEquality(loginPageActions.getLoggedInUserName(),
                loggedInUser);
    }

}
