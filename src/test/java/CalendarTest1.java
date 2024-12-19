import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest1 {
    public static void main(String[] args) {
        String monthNumber = "6";
        String date = "15";
        String year = "2027";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");


    }
}
