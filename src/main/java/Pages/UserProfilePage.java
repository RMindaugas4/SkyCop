package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserProfilePage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='surname']")
    private WebElement surnameField;

    @FindBy(xpath = "//a[@href='/profile' and @class !='dropdown-item']")
    private WebElement editProfileTab;

    @FindBy(xpath = "//a[@href='/payment' and @class !='dropdown-item']")
    private WebElement payoutTab;

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    public UserProfilePage fillFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        return this;
    }

    public UserProfilePage fillSurname(String surname) {
        surnameField.clear();
        surnameField.sendKeys(surname);
        return this;
    }

    public UserProfilePage clickPayoutTab() {
        payoutTab.click();
        return this;
    }

    public UserProfilePage clickEditProfileTab() {
        editProfileTab.click();
        return this;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }
}
