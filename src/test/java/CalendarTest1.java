import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarTest1 {
    public static void main(String[] args) {
        String monthNumber = "6";
        String date = "15";
        String year = "2027";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber) - 1).click();
        driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

        // System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getAttribute("value"));

        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i = 0; i < actualList.size(); i++){
            System.out.println(actualList.get(i).getAttribute("value"));
        }
    }
}
