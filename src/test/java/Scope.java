import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    public static void main(String[] args) {
        // Count links on the page
        WebDriver driver = new ChromeDriver();

        driver.get("https://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        // driver.findElements(By.tagName("a")).size();

    }
}
