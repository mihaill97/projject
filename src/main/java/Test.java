import driver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends DriverManager {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://google.com");


    }

}
