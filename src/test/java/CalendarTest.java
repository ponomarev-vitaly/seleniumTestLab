import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {
    public static void main(String[] args) throws InterruptedException {
        String monthNumber = "6";
        String date = "15";
        String year = "2027";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//input[@name='month']")).sendKeys(monthNumber);
        driver.findElement(By.xpath("//input[@name='day']")).sendKeys(date);
        driver.findElement(By.xpath("//input[@name='year']")).sendKeys(year);

        driver.findElement(By.xpath("//label[normalize-space()='Delivery Date']")).click();

        Thread.sleep(3000L);

        Assert.assertEquals(driver.findElement(By.xpath("//input[@name='month']")).getAttribute("value"), monthNumber, "Month is wrong...");
        Assert.assertEquals(driver.findElement(By.xpath("//input[@name='day']")).getAttribute("value"), date, "Day is wrong...");
        Assert.assertEquals(driver.findElement(By.xpath("//input[@name='year']")).getAttribute("value"), year, "Year is wrong...");

    }
}
