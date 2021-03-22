package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObects.FeedPage;

public class FeedPageSteps {
    FeedPage feedpage = new FeedPage();

    @Given("^User clicks on Global Feed tab$")
    public void user_clicks_on_global_feed_tab() {
        feedpage.clickOnGlobalFeedTab();
    }

    @Given("^User clicks on favorite icon for any article$")
    public void user_clicks_on_favorite_icon() {
        feedpage.clickFavoriteIcon();
    }

    @When("^User lands on Your Feed screen$")
    public void user_lands_on_your_feed_screen() {
        feedpage.verifyUserIsOnYourFeedPage();
    }

    @When("^User lands on Global Feed screen$")
    public void user_lands_on_global_feed_screen() {
        feedpage.verifyUserIsOnGlobalFeedPage();
    }

    @Given("^User should see favorite icon for article$")
    public void user_should_see_favorite_icon() {
        feedpage.verifyFavoriteIconIsDisplayed();
    }

    @Given("^User should not see favorite icon for article$")
    public void user_should_not_see_favorite_icon() {
        feedpage.verifyFavoriteIconIsNotDisplayed();
    }

    @Given("^User clicks on the same article$")
    public void user_clicks_on_article() {
        feedpage.clickOnArticle();
    }

    @Then("^User should see Unfavorite Post icon on two places on screen$")
    public void user_should_see_unfavorite_post_button() {
        feedpage.verifyUnfavoritePostBtn();
    }
}
