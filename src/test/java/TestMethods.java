import org.openqa.selenium.WebDriver;

public class TestMethods {
    public static WebDriver driver;

    public static String getURL(){
       return driver.getCurrentUrl();
    }

    public static void typeEmail(String email) {
        driver.findElement(Matchers.emailForm).sendKeys(email);
    }

    public static void typePassword(String password) {
        driver.findElement(Matchers.passwordForm).sendKeys(password);
    }

    public static void clickSignIn() {
        driver.findElement(Matchers.signInButton).click();
    }

    public static void login(String email, String password){
        TestMethods.typeEmail(email);
        TestMethods.typePassword(password);
        TestMethods.clickSignIn();
    }

    public static String loginError(){
       return driver.findElement(Matchers.signInError).getText();
    }

    public static String getPageTitle(){
       return driver.getTitle();
    }






}
