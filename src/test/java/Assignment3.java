import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

        driver.findElement(By.cssSelector("#okayBtn")).click();

        WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
        Select dropDownSelect = new Select(dropdown);
        dropDownSelect.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();

        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

        String[] namesOfMobilePhones = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
        addMobilePhonesToCart(driver, namesOfMobilePhones);

        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();


    }

    public static void addMobilePhonesToCart(WebDriver driver, String[] namesOfMobilePhones) {
        int j = 0;
        List<WebElement> mobilePhones = driver.findElements(By.cssSelector("h4.card-title"));

        for (int i = 0; i < mobilePhones.size(); i++) {
            String nameOfThePhone = mobilePhones.get(i).getText();

            // Convert array into array list for easy search
            List<String> namesList = Arrays.asList(namesOfMobilePhones);

            if (namesList.contains(nameOfThePhone)) {
                j++;
                System.out.println(driver.findElements(By.cssSelector(".card-title")).get(i).getText());
                driver.findElements(By.xpath("//button[contains(text(),'Add')]")).get(i).click();

                if (j == namesOfMobilePhones.length) {
                    System.out.println(driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).getText());
                    if (driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).getText().contains("4")) {
                        System.out.println("The cart is full, you're ready to check out...");
                        Assert.assertTrue(true);
                    } else {
                        Assert.fail();
                    }
                    break;
                }
            }
        }
    }
}
