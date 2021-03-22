package steps;

import cucumber.api.java.en.Given;
import pageObects.UserProfilePage;

public class UserProfileSteps {
    UserProfilePage userProfilePage = new UserProfilePage();

    @Given("^User clicks on Favorited Articles tab$")
    public void user_clicks_on_favorited_articles_tab() throws InterruptedException {
        userProfilePage.clickOnFavoritedArticlesTab();
    }

    @Given("^User clicks on My Articles tab$")
    public void user_clicks_on_my_articles_tab() throws InterruptedException {
        userProfilePage.clickOnMyArticlesTab();
    }

    @Given("^User should see \"([^\"]*)\" text$")
    public void user_should_see_text(String message) throws InterruptedException {
        userProfilePage.verifyEmptyMessageDisplayed(message);
    }
}
