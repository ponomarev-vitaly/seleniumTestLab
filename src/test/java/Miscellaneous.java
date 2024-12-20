import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("sessionKey");
        // driver.manage().addCookie("abc");
        driver.get("http://google.com");
    }
}
