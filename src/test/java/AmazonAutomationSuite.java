import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonAutomationSuite {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions a = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
        WebElement moveToElementHello = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        a.moveToElement(moveToElementHello).contextClick().build().perform();

    }
}
