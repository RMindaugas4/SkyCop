package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimEligibilityPage extends BasePage {


    public ClaimEligibilityPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
