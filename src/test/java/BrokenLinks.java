import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");

        HttpURLConnection connectToWeb = (HttpURLConnection) new URL(url).openConnection();

        connectToWeb.setRequestMethod("HEAD");
        connectToWeb.connect();
        int responseCode = connectToWeb.getResponseCode();
        System.out.println(responseCode);

    }
}
