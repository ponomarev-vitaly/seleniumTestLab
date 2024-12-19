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

        // Count links in the first column of the footer

        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());
        // columnDriver.findElements(By.tagName("a")).size();

        // Click on each link in the column and check if the pages were opened

        for(int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++ ){
            columnDriver.findElements(By.tagName("a")).get(i).click();

        }
    }
}
