package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInputField;

    @FindBy(id = "js-password")
    private WebElement passwordInputField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    private LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public static LoginPage getLoginPage(WebDriver driver) {
        return new LoginPage(driver);
    }


    public LoginPage fillEmailField(String userEmail) {
        emailInputField.clear();
        emailInputField.sendKeys(userEmail);
        return this;
    }

    public LoginPage fillPasswordField(String userPassword) {
        passwordInputField.clear();
        passwordInputField.sendKeys(userPassword);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
