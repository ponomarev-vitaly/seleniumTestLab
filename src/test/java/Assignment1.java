import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());
        driver.findElement(By.name("checkBoxOption1")).click();
        Thread.sleep(3000L);
        Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());
        driver.findElement(By.name("checkBoxOption1")).click();
        Thread.sleep(3000L);
        Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());
        int countOfNumberAllCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println(countOfNumberAllCheckboxes);
    }
}
