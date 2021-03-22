package pageObects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.DriverUtils.*;
import java.util.List;
import static utils.AssertionUtils.*;
import static utils.CommonUtils.clickOnElement;
import static utils.WebElementUtils.*;

public class FeedPage {
    public FeedPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Global Feed'][contains(@class,'nav-link')]")
    private WebElement globalFeedTab;

    @FindBy(xpath = "//a[text()='Your Feed'][contains(@class,'nav-link')]")
    private WebElement yourFeedTab;

    @FindBy(xpath = "//button[@class='btn btn-sm pull-xs-right btn-outline-primary']")
    private WebElement favoriteIcon;

    @FindBy(xpath = "//button/i[@class='ion-heart']")
    private WebElement heartsymbolInFavoriteIcon;

    @FindBy(xpath = "//button/div[@class='info']")
    private WebElement numericInfavoriteIcon;

    @FindBy(xpath = "//a[@class='preview-link']")
    private WebElement articleLink;

    @FindBy(xpath = "//button[contains(text(),'Unfavorite Post')]")
    private List<WebElement> unfavoritePostBtns;

    public void clickOnGlobalFeedTab() {
        clickOnElement(globalFeedTab);
    }

    public void verifyFavoriteIconIsDisplayed(){
        waitForElementToBeClickable(favoriteIcon);
        assertPresent(favoriteIcon);
        assertPresent(heartsymbolInFavoriteIcon);
        assertPresent(numericInfavoriteIcon);
        tearDown();
    }

    public void verifyUserIsOnYourFeedPage(){
        assertEquals(yourFeedTab,yourFeedTab.getAttribute("class"),"nav-link active");
    }

    public void verifyUserIsOnGlobalFeedPage(){
        assertEquals(globalFeedTab,globalFeedTab.getAttribute("class"),"nav-link active");
    }

    public void verifyFavoriteIconIsNotDisplayed(){
        assertNotPresent(favoriteIcon);
        assertNotPresent(heartsymbolInFavoriteIcon);
        assertNotPresent(numericInfavoriteIcon);
        tearDown();
    }

    public void clickFavoriteIcon() {
        clickOnElement(favoriteIcon);
    }

    public void clickOnArticle() {
        clickOnElement(articleLink);
    }

    public void verifyUnfavoritePostBtn() {
        Assert.assertEquals(unfavoritePostBtns.size(),2);
        tearDown();
    }

}
