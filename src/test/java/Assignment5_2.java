import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_2 {
    public static void main(String[] args) {


        //System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']")).click();
        System.out.println("Total Frames : " + driver.findElements(By.tagName("frame")).size());
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        System.out.println("Value : " + driver.findElement(By.cssSelector("div#content")).getText());

    }
}
