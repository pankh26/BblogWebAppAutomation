package pageObects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.DriverUtils.getDriver;
import static utils.CommonUtils.clickOnElement;
import static utils.CommonUtils.sendKeysTo;
import static utils.ConfigUtils.getPropertyByKey;

public class CreatePostPage {
    public CreatePostPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//button[text()=' Publish Article ']")
    private WebElement publishArticleBtn;

    @FindBy(xpath = "//i[@class='ion-compose']")
    private WebElement newPostButton;

    @FindBy(xpath = "//input[@placeholder='Article Title']")
    private WebElement articleTitleInputBox;

    @FindBy(xpath = "//input[contains(@placeholder,'this article about?')]")
    private WebElement articleAboutInputBox;

    @FindBy(xpath = "//textarea[contains(@placeholder,'Write your article')]")
    private WebElement writeYourArticleInputBox;

    @FindBy(xpath = "//input[@placeholder='Enter Tags']")
    private WebElement enterTagsInputBox;

    public void clickOnNewPost() {
        clickOnElement(newPostButton);
    }

    public void clickOnPublishArticle() {
        clickOnElement(publishArticleBtn);
    }
    public void createNewPost() {
        sendKeysTo(articleTitleInputBox, getPropertyByKey("articleTitle"));
        sendKeysTo(articleAboutInputBox, getPropertyByKey("articleAbout"));
        sendKeysTo(writeYourArticleInputBox, getPropertyByKey("writeYourArticle"));
        sendKeysTo(enterTagsInputBox, getPropertyByKey("tags"));
    }

}
