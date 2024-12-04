import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainAutomationTests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        // Firefox launch
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://rahulshettyacademy.com");
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        driver1.close();
        // Microsoft Edge launch
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://rahulshettyacademy.com");
        System.out.println(driver2.getTitle());
        System.out.println(driver2.getCurrentUrl());
        driver2.close();
    }

}
