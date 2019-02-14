import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
    ChromeDriver driver;

    public Drivers() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oana.horvath\\Documents\\ChromeDriver\\chromedriver.exe");
        this.driver = new ChromeDriver();

      //  System.setProperty("webdriver.gecko.driver", "C:\\Users\\oana.horvath\\Documents\\Firefox-driver\\geckodriver.exe");
      //   FirefoxDriver firefox = new FirefoxDriver();
    }

}
