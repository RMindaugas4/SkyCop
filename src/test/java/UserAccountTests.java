import Pages.ClaimEligibilityPage;
import Pages.LoginPage;
import Pages.UserProfilePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class UserAccountTests extends BaseTest {

    private String expectedNameField;
    private String expectedSurnameField = "Date that can be lost";

    /**
     * Test is about checking if the user input value is not lost when user switch between tabs.
     */
    @Test
    public void testIfUserDataDoesNotResetWhenSwitchingTabs() {
        expectedNameField = UUID.randomUUID().toString();

        ClaimEligibilityPage eligibility = new ClaimEligibilityPage(driver);
        UserProfilePage profilePage = new UserProfilePage(driver);
        LoginPage loginPage = LoginPage.getLoginPage(driver);

        eligibility.clickLoginButton();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getLoginButton()));

        loginPage.fillEmailField(DTO.login2).fillPasswordField(DTO.pass).clickLoginButton();
        wait.until(ExpectedConditions.visibilityOf(profilePage.getFirstNameField()));

        profilePage.fillFirstName(expectedNameField).fillSurname(expectedSurnameField).clickPayoutTab().clickEditProfileTab();

        Assert.assertEquals(profilePage.getFirstNameField().getText(), expectedNameField, "The data has been changed or modified.");


    }
}
