import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
        Set<String> a = driver.getWindowHandles();
        Iterator<String> s = a.iterator();
        String parent = s.next();
        String child = s.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
    }
}

