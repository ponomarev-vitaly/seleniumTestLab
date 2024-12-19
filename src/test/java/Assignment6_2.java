import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//WebElement checkPath=driver.findElement(By.xpath("//*[@id='checkbox-example']"));

        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String text=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();

        System.out.println(text);

        WebElement dropdown=driver.findElement(By.name("dropdown-class-example"));

        Select select=new Select(dropdown);

        select.selectByVisibleText(text);

        driver.findElement(By.name("enter-name")).sendKeys(text);

        driver.findElement(By.id("alertbtn")).click();

        String alertText=driver.switchTo().alert().getText();

        String optionPresent=alertText.split(",")[0].split(" ")[1];

        Assert.assertEquals(text, optionPresent);

        Assert.assertTrue(text.equals(optionPresent));

        Assert.assertTrue(text.equals(optionPresent));

    }


}
