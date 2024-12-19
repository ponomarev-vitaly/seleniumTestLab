import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,750)");

        // Thread.sleep(3000L);

        List<WebElement> headersOfTheTableWithCourses1 = driver.findElements(By.cssSelector(".table-display th:nth-child(1)"));
        List<WebElement> headersOfTheTableWithCourses2 = driver.findElements(By.cssSelector(".table-display th:nth-child(2)"));
        List<WebElement> headersOfTheTableWithCourses3 = driver.findElements(By.cssSelector(".table-display th:nth-child(3)"));

        List<WebElement> tableWithCourses1 = driver.findElements(By.cssSelector(".table-display td:nth-child(1)"));
        List<WebElement> tableWithCourses2 = driver.findElements(By.cssSelector(".table-display td:nth-child(2)"));
        List<WebElement> tableWithCourses3 = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));

        int numberOfRows = headersOfTheTableWithCourses3.size() + tableWithCourses3.size();
        System.out.println("Number of rows: " + numberOfRows);

        int numberOfColumns = headersOfTheTableWithCourses1.size() + headersOfTheTableWithCourses2.size() + headersOfTheTableWithCourses3.size();
        System.out.println("Number of columns: " + numberOfColumns);

        for (int j = 0; j < numberOfColumns * 10; j++) {
            System.out.print("-----");
        }
        System.out.println();

        System.out.println(headersOfTheTableWithCourses1.get(0).getText() + " | " + headersOfTheTableWithCourses2.get(0).getText() + " | " + headersOfTheTableWithCourses3.get(0).getText());

        for (int j = 0; j < numberOfColumns * 10; j++) {
            System.out.print("-----");
        }
        System.out.println();
        for (int i = 0; i < numberOfRows - 1; i++) {
            System.out.println(tableWithCourses1.get(i).getText() + " | " + tableWithCourses2.get(i).getText() + " | " + tableWithCourses3.get(i).getText());
        }


    }
}
