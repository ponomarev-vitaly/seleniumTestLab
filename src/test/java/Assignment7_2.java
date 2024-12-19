import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement table = driver.findElement(By.id("product"));
        int row = table.findElements(By.tagName("tr")).size();
        int column = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
        System.out.println("Number of rows" + row);
        System.out.println("Number of column" + column);
        List<WebElement> content = table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
        for (int i = 0; i < content.size(); i++) {

            System.out.println(content.get(i).getText());

        }
        driver.quit();
    }
}
