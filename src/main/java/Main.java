import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oana.horvath\\Documents\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        driver.get("http://automationpractice.com/index.php");
        WebElement loginButton = driver.findElement(By.className("login"));
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement emailForm = driver.findElement(By.id("email"));
        emailForm.sendKeys("qaohff@gmail.com");

        WebElement passwordForm = driver.findElement(By.cssSelector("#passwd"));
        passwordForm.sendKeys("mozilla11");

        WebElement signInButton = driver.findElement(By.cssSelector("#SubmitLogin"));
        signInButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.getTitle().equals("My account - My Store")) {
            System.out.println("login successful");
        }

        driver.quit();
    }
}