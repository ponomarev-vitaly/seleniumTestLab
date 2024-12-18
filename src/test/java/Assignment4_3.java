import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Assignment4_3 {


    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "E:\\ATT\\Selenium_RShetty\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> windows = driver.getWindowHandles(); // [Parentid, childid]
        Iterator<String> it = windows.iterator();
        String parentid = it.next(); // (Parent id)
        String childid = it.next(); // (child id)
        driver.switchTo().window(childid);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());
        driver.switchTo().window(parentid);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());

    }
}

