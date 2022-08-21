package driver_manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;
    private static void setDriver() {
        driver = new ChromeDriver(WebDriverConfig.configChrome());

    }
    public static WebDriver getDriver(){
        setDriver();
        return driver;
    }
}