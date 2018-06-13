import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {


    WebDriver driver;
    WebDriverWait wait;
    UUID randomGuid;

    @BeforeMethod
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get(DTO.applicationUrl);

    }


    @AfterMethod
    public void TearDown() {
        driver.close();
    }
}
