import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        int i = 1;
        while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

    }
}
