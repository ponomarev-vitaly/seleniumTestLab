import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShoppingCartService {
    public static void main(String[] args) throws InterruptedException {
        String[] names = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        // Thread.sleep(3000L);
        addItems(driver, names);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

    }

    public static void addItems(WebDriver driver, String[] names) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String nameOfTheProduct = products.get(i).getText();
            nameOfTheProduct = nameOfTheProduct.split("-")[0];
            nameOfTheProduct = nameOfTheProduct.trim();

            // Convert array into array list for easy search
            List<String> namesList = Arrays.asList(names);

            if (namesList.contains(nameOfTheProduct)) {
                j++;
                // driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                // Thread.sleep(5000L);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == names.length) {
                    break;
                }
            }
        }
    }
}
