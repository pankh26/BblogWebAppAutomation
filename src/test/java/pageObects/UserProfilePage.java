package pageObects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.DriverUtils.*;
import static utils.AssertionUtils.*;
import static utils.CommonUtils.clickOnElement;

public class UserProfilePage {
    public UserProfilePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Favorited Articles')]")
    private WebElement favoritedArticlesTab;

    @FindBy(xpath = "//a[contains(text(),'My Articles')]")
    private WebElement myArticlesTab;

    @FindBy(xpath = "//div[@class='app-article-preview'][2]")
    private WebElement emptyFavoritedArticlesMessage;

    public void clickOnFavoritedArticlesTab() {
        clickOnElement(favoritedArticlesTab);
    }

    public void clickOnMyArticlesTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(myArticlesTab);
    }

    public void verifyEmptyMessageDisplayed(String message) throws InterruptedException {
        Thread.sleep(2000);
        assertEquals(emptyFavoritedArticlesMessage,emptyFavoritedArticlesMessage.getText(),message);
        tearDown();
    }

}

