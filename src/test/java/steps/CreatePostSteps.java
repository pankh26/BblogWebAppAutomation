package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import pageObects.CreatePostPage;

public class CreatePostSteps {
    CreatePostPage createPostPage = new CreatePostPage();

    @Given("^User clicks on New post button$")
    public void userClicksOnNewPostButton() {
        createPostPage.clickOnNewPost();
    }

    @Given("^User enters values in input boxes$")
    public void userEntersValuesInInputBoxes() {
        createPostPage.createNewPost();
    }

    @And("^User clicks on Publish Article button$")
    public void userClicksOnPublishArticleButton() {
        createPostPage.clickOnPublishArticle();
    }

}
