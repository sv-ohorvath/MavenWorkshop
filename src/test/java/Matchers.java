import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Set;

public class Matchers {

    public static By emailForm = By.id("email");

    public static By passwordForm = By.cssSelector("#passwd");

    public static By signInButton = By.cssSelector("#SubmitLogin");

    public static By signInError = By.cssSelector("#alert.alert-danger ol li");

    public static String invalidLoginError = "Authentication failed.";
}
