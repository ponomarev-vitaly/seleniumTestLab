import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://qaclickacademy.com/practice.php");

        // String verificationText = driver.findElement(By.cssSelector("label[for='honda']")).getText();
        String verificationText = driver.findElement(By.xpath("(//*[@id='checkbox-example']/fieldset/label)[3]")).getText();
        System.out.println(verificationText);

        // driver.findElement(By.xpath("(//input[@id='checkBoxOption3'])[1]")).click();
        driver.findElement(By.xpath("(//*[@id='checkbox-example']/fieldset/label/input)[3]")).click();

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText(verificationText);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(verificationText);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        String textFromTheAlert = driver.switchTo().alert().getText().split(" ")[1].split(",")[0];
        System.out.println(textFromTheAlert);

        if (verificationText.equals(textFromTheAlert)) {
            System.out.println("Text verified successfully...");
        } else {
            System.out.println("Sth is wrong...");
        }


    }
}
