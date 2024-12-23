import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class ECommercePresentation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        // First click on the column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        // Create a list od webelements to grab everything from the page into a new list
        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
        // Grab text of all webelements into a new original list
        List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
        // Sort the items in the original list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        // Compare original list with sorted list
        Assert.assertTrue(originalList.equals(sortedList));


    }
}
