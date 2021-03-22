package steps;

import pageObects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homepage = new HomePage();

    @Given("^User is on Homepage of the application$")
    public void userIsOnHomepage() {
        homepage.verifyUserOnHomepage();
    }

    @When("^User navigates to login page$")
    public void verifyUserIsonLoginPage() {
        homepage.navigateToLoginPage();
    }

    @Then("^Verify successful login$")
    public void verifySuccessfulUserlogin() {
        homepage.verifyUserNameAfterLogin();
    }

    @When("^User selects \"([^\"]*)\" from homepage$")
    public void user_selects_from_homepage(String itemName) throws InterruptedException {
        homepage.selectItemFromHOmePage(itemName);
    }

    @When("^User clicks on Home tab$")
    public void user_clicks_on_home_tab() throws InterruptedException {
        homepage.clickOnHomeTab();
    }

    @When("^User clicks on username displayed on top$")
    public void user_clicks_on_username() throws InterruptedException {
        homepage.clickOnUsername();
    }
}
