import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartService {
    public static void main(String[] args) {
        String[] names = {"Cucumber", "Brocolli", "Beetroot"};

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i =0; i<products.size(); i++){
            String nameOfTheProduct = products.get(i).getText();
            nameOfTheProduct = nameOfTheProduct.split("-")[0];
            nameOfTheProduct = nameOfTheProduct.trim();

            // Convert array into array list for easy search
            List namesList = Arrays.asList(names);
            int j=0;
            if(namesList.contains(nameOfTheProduct)){
                j++;
                driver.findElement(By.xpath("(//button[text()='ADD TO CART'])["+i+"]")).click();

            }
        }

    }
}
