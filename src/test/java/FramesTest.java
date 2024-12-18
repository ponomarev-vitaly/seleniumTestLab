import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
        // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        // driver.findElement(By.id("draggable")).click();
        Actions a = new Actions(driver);
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));
        a.dragAndDrop(sourceElement, targetElement).build().perform();

        driver.switchTo().defaultContent(); // Step to switch to normal window


    }
}
