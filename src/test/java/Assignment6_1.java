import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment6_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[3]/input")).click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@class='right-align']/fieldset/label"));

        System.out.println(checkBoxes.size());

        for (int i = 1; i <= checkBoxes.size(); i++) {

            WebElement checkBox = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[" + i + "]"));

            if (driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[" + i + "]/input")).isSelected()) {

                String value = checkBox.getText();

// System.out.println(value);

                Select dropDown = new Select(driver.findElement(By.id("dropdown-class-example")));

                dropDown.selectByVisibleText(value);

                driver.findElement(By.name("enter-name")).sendKeys(value);

                driver.findElement(By.id("alertbtn")).click();

                if (driver.switchTo().alert().getText().contains(value)) {

                    System.out.println("Alert message success");

                    driver.switchTo().alert().accept();

                } else {

                    System.out.println("Something wrong with execution");

                }

            }

        }

        // driver.close();}


    }
}
