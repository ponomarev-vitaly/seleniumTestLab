import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://qaclickacademy.com/practice.php");

        String verificationText = driver.findElement(By.cssSelector("label[for='honda']")).getText();
        System.out.println(verificationText);

        driver.findElement(By.xpath("(//input[@id='checkBoxOption3'])[1]")).click();



    }
}
