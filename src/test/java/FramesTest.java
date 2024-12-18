import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        driver.findElement(By.id("draggable")).click();


    }
}
