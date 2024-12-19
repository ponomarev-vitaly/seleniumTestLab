import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement table  =  driver.findElement(By.id("product"));
        System.out.println("Row Size: " + table.findElements(By.tagName("tr")).size());
        System.out.println("Column Size: "+ table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println("2ndRow Column1:" + secondRow.get(0).getText());
        System.out.println("2ndRow Column2:" + secondRow.get(1).getText());
        System.out.println("2ndRow Column3:" + secondRow.get(2).getText());
        driver.quit();
    }
}
