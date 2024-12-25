import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();

        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");


    }
}
