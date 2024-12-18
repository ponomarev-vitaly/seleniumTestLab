import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class Assignment4_1 {

    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","C:\\Users\\v-mdabbugunt\\Downloads\\131chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

    }
}
