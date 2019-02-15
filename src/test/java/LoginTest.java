import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        Drivers driver1 = new Drivers();
        driver = driver1.DriversChrome();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test (priority = 1)
    public void validLogin() {
        TestMethods.login("qaohff@gmail.com", "mozilla11");
        Assert.assertEquals(TestMethods.getPageTitle(), "My account - My Store");

    }

    @Test (priority = 0)
    public void invalidLogin() {
        TestMethods.login("qaohff@gmail.com", "wrongpassword");
        Assert.assertEquals(TestMethods.loginError(), Matchers.invalidLoginError);
    }


    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }


}
