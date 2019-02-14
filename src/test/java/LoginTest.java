import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    Drivers driver = new Drivers(ChromeDriver driver){};

    @BeforeClass
    public static void setUp() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.wait();
    }

    @Test
    public void validLogin() {
        TestMethods.login("qaohff@gmail.com", "mozilla11");
        Assert.assertEquals(TestMethods.getPageTitle(), "My account - My Store");

    }

    @Test
    public void invalidLogin() {
        TestMethods.login("qaohff@gmail.com", "wrongpassword");
        Assert.assertEquals(TestMethods.loginError(), "Authentication failed.");
    }


    /*@AfterClass
    public void quitBrowser() {
        driver.quit();
    }
*/

}
