import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[value='BLR']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();


    }
}
