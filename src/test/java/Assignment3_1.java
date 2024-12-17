import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment3_1 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver", "C:\\Intel\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/"); //


        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));


        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        // Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value ='user']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("okayBtn")).click();
        //driver.switchTo().alert().accept();
        WebElement option = driver.findElement(By.cssSelector("select.form-control"));

        Select dropdown = new Select(option);
        dropdown.selectByValue("consult");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        w.until(ExpectedConditions.titleIs("ProtoCommerce"));

        List<WebElement> products = driver.findElements(By.cssSelector("button.btn.btn-info"));
        for (int i = 0; i < products.size(); i++) {
            products.get(i).click();
        }
        Thread.sleep(8000);
        driver.findElement(By.partialLinkText("Checkout")).click();
    }
}


