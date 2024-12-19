import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    public static void main(String[] args) {
        // Count links on the page
        WebDriver driver = new ChromeDriver();

        driver.get("https://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());

        // Count links only in the footer

        // driver.findElements(By.tagName("a")).size();
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        // footerDriver.findElements(By.tagName("a")).size();

    }
}
