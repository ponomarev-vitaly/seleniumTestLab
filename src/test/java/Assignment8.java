import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment8 {
    public static void main(String[] args) throws InterruptedException {
        String countryToSearchFor = "United Kingdom (UK)";
        String countryToSearchFor1;
        String countryFound = "";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement selectTheCountry = driver.findElement(By.xpath("//input[@id='autocomplete']"));

        js.executeScript("window.scrollBy(0,50)");
        Thread.sleep(3000L);

        selectTheCountry.sendKeys("uni");
        Thread.sleep(3000L);

        js.executeScript("document.querySelector('.ui-menu-item').scrollBy(0,50)");
        js.pin("document.querySelector('.ui-menu-item-wrapper').scrollBy(0,50)");

        List<WebElement> listOfCountries = driver.findElements(By.cssSelector(".ui-menu-item .ui-menu-item-wrapper"));
        for (int i = 0; i < listOfCountries.size(); i++) {

            countryToSearchFor1 = listOfCountries.get(i).getText();
            if (countryToSearchFor1.equals(countryToSearchFor)) {
                listOfCountries.get(i).click();
                System.out.println("There is a match: " + countryToSearchFor1);
                countryFound = countryToSearchFor1;

            }

        }

        System.out.println("The country found after looping the list: " + countryFound);
        System.out.println("THe country found after parsing the input form: " + selectTheCountry.getAttribute("value"));

        Assert.assertEquals(selectTheCountry.getAttribute("value"), countryFound);


//        js.executeScript("document.querySelector('.ui-menu-item').scrollBy(0,50)");
//        js.pin("document.querySelector('.ui-menu-item-wrapper').scrollBy(0,50)");
//        String firstEelement = (String) js.executeScript("document.querySelector('.ui-menu-item-wrapper').textContent");
//        System.out.println(firstEelement);


    }
}
