import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class JavaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000L);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        int actualSum = 0;

        for(int i = 0; i< values.size(); i++){
            actualSum += Integer.parseInt(values.get(i).getText());

        }

        System.out.println(actualSum);

        int expectedSum = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        System.out.println(expectedSum);
        Assert.assertEquals(actualSum, expectedSum);

        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(3000L);
        js.executeScript("window.scrollBy(0,750)");
        Thread.sleep(3000L);
        js.executeScript("document.querySelector('.table-display').scrollTop=5000");

        List<WebElement> tableWithCourses = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));

        int actualSum1 = 0;

        for(int j = 0; j< tableWithCourses.size(); j++){
            actualSum1 += Integer.parseInt(tableWithCourses.get(j).getText());
            System.out.println(actualSum1);
        }

        System.out.println(actualSum1);


    }
}
