import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Set;

public class Matchers {
    public static WebDriver driver = new WebDriver() {
        public void get(String s) {

        }

        public String getCurrentUrl() {
            return null;
        }

        public String getTitle() {
            return null;
        }

        public List<WebElement> findElements(By by) {
            return null;
        }

        public WebElement findElement(By by) {
            return null;
        }

        public String getPageSource() {
            return null;
        }

        public void close() {

        }

        public void quit() {

        }

        public Set<String> getWindowHandles() {
            return null;
        }

        public String getWindowHandle() {
            return null;
        }

        public TargetLocator switchTo() {
            return null;
        }

        public Navigation navigate() {
            return null;
        }

        public Options manage() {
            return null;
        }
    };

    public static WebElement emailForm = driver.findElement(By.id("email"));

    public static WebElement passwordForm = driver.findElement(By.cssSelector("#passwd"));

    public static WebElement signInButton = driver.findElement(By.cssSelector("#SubmitLogin"));

    public static WebElement signInError = driver.findElement (By.cssSelector("#alert.alert-danger ol li"));


}
