import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("");
        String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");


    }
}
