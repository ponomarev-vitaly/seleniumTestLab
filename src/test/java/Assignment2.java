import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Kristin");
        driver.findElement(By.name("email")).sendKeys("mirdehogna@gufum.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("%YK6URMs!6");
        driver.findElement(By.id("exampleCheck1")).click();

//        driver.findElement(By.id("exampleFormControlSelect1")).click();
//        Thread.sleep(3000L);
//        driver.findElement(By.xpath("//option[normalize-space()='Female']")).click();

        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("Female");

        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("05.06.1999");
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        String strSuccessText = driver.findElement(By.cssSelector(".alert-success")).getText();
        System.out.println(strSuccessText);
        if(strSuccessText.contains("The Form has been submitted successfully!")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

    }
}
