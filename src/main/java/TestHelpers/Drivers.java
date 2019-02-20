package TestHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
    private WebDriver chromeDriver;
    private WebDriver firefoxDriver;

    public WebDriver DriversChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oana.horvath\\Documents\\ChromeDriver\\chromedriver.exe");
        return this.chromeDriver = new ChromeDriver();
    }
    public WebDriver DriversFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\oana.horvath\\Documents\\Firefox-driver\\geckodriver.exe");
        return this.firefoxDriver = new FirefoxDriver();
    }

}
