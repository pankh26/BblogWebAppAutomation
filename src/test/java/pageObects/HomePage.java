package pageObects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.DriverUtils.*;
import static utils.AssertionUtils.assertEquals;
import static utils.AssertionUtils.assertPageTitle;
import static utils.CommonUtils.clickOnElement;
import static utils.ConfigUtils.getPropertyByKey;
import static utils.WebElementUtils.createDynamicLocator;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"#/login\"]")
    private WebElement signInBtn;

    @FindBy(xpath = "//a[@href=\"#/register\"]")
    private WebElement signUpBtn;

    @FindBy(xpath = "//a[@href=\"#/\" and @class=\"nav-link\"]")
    private WebElement homeBtn;

    @FindBy(xpath = "//a[@href=\"#/\" and @class=\"navbar-brand\"]")
    private  WebElement logoImage;

    @FindBy(xpath = "//a[starts-with(@href,\"#/profile\")]")
    private WebElement userNameText;

    public void verifyUserOnHomepage() {
        assertPageTitle(getPropertyByKey("homepage.title"));
    }

    public void navigateToLoginPage() {
        clickOnElement(signInBtn);
    }

    public void verifyUserNameAfterLogin() {
        assertEquals(userNameText, userNameText.getText(), getPropertyByKey("loggedin.user"));
    }

    public void clickOnHomeTab() {
        clickOnElement(homeBtn);
    }

    public void clickOnUsername() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(userNameText);
    }

    public void selectItemFromHOmePage(String itemName) {
        clickOnElement(logoImage);
        WebElement itemNameElement = createDynamicLocator("//*[contains(@class,'nav-link')]", itemName);
        clickOnElement(itemNameElement);
    }

}