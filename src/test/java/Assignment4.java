import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> stringIterator = windows.iterator();
        String parentId = stringIterator.next();
        String childId = stringIterator.next();

        driver.switchTo().window(childId);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='example'] h3")));
        String textInChildWindow = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
        System.out.println("The text from the child window: " + textInChildWindow);

        driver.switchTo().window(parentId);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='example'] h3")));
        String textInParentWindow = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
        System.out.println("The text from the parent window: " + textInParentWindow);


    }
}
