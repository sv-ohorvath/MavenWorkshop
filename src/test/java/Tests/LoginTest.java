package Tests;

import Pages.LoginPage;
import TestHelpers.Drivers;
import TestHelpers.Matchers;
import org.openqa.selenium.WebDriver;
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
        LoginPage.login("qaohff@gmail.com", "mozilla11");
        Assert.assertEquals(LoginPage.getPageTitle(), "My account - My Store");

    }

    @Test (priority = 0)
    public void invalidLogin() {
        LoginPage.login("qaohff@gmail.com", "wrongpassword");
        Assert.assertEquals(LoginPage.loginError(), Matchers.invalidLoginError);
    }


    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }


}
