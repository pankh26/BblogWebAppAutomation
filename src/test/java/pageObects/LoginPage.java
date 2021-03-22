package pageObects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.DriverUtils.*;
import static utils.AssertionUtils.*;
import static utils.CommonUtils.*;
import static utils.ConfigUtils.*;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h1[text()=\"Sign in\"]")
    private WebElement signInText;
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement enterEmailAddress;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement enterPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInSubmitBtn;

    public void verifyUserIsOnLoginPage() {
        assertPresent(signInText);
    }

    public void login() throws InterruptedException {
        sendKeysTo(enterEmailAddress, getPropertyByKey("username"));
        sendKeysTo(enterPassword, getPropertyByKey("password"));
        Thread.sleep(2000);
        clickOnElement(signInSubmitBtn);
    }
}
