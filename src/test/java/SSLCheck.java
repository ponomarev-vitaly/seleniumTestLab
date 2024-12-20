import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

        FirefoxOptions options1 = new FirefoxOptions();
        options1.setAcceptInsecureCerts(true);
        WebDriver driver1 = new FirefoxDriver(options1);
        driver1.get("https://expired.badssl.com/");
        System.out.println(driver1.getTitle());


    }
}
