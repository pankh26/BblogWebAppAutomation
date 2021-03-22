package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObects.LoginPage;

public class LoginPageSteps {
    LoginPage loginpage = new LoginPage();

    @Then("^Verify user on login page$")
    public void verify_user_on_login_page() throws InterruptedException {
         loginpage.verifyUserIsOnLoginPage();
    }
    @When("^User enters username and password$")
    public void user_enters_username_and_password() throws InterruptedException {
        loginpage.login();
    }
}
