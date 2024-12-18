import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AmazonAutomationSuite {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("(//span[@class='a-button-inner'])[1]")));

        //driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();

        Actions a = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
        WebElement moveToElementHello = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        a.moveToElement(moveToElementHello).build().perform();

        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();






    }
}
