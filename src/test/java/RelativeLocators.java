import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(nameEditBox)).getText());        ;

        WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).below(dateOfBirth)).click();

        WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

        WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(radioButton)).getText());


    }
}
