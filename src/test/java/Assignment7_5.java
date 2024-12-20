import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement tableWithCourses = driver.findElement(By.id("product"));
        int numberOfColumns = tableWithCourses.findElements(By.tagName("th")).size();
        System.out.println("Number of Columns: " + numberOfColumns);

        int numberOfRows = tableWithCourses.findElements(By.tagName("tr")).size();
        System.out.println("Number of Rows: " + numberOfRows);

        for(int i=0;i<numberOfColumns;i++){
            System.out.print(tableWithCourses.findElements(By.tagName("th")).get(i).getText() + " " + "|" + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        for(int j=1;j<tableWithCourses.findElements(By.tagName("tr")).size();j++){
            System.out.println(tableWithCourses.findElements(By.tagName("tr")).get(j).getText());
        }
    }
}
