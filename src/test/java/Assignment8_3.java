import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment8_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium WebDrivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String actualCountry = "India";

        //sending input to the textbox

        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("In");

        Thread.sleep(5000);

        // Taking out all the suggested countryList & selecting required country

        List<WebElement> suggestedCountries = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

/*for(int i=0;i<suggestedCountries.size();i++) {

String pickedCountry=suggestedCountries.get(i).getText();

System.out.println(pickedCountry);

if(actualCountry.equalsIgnoreCase(pickedCountry)) {

suggestedCountries.get(i).click();

}*/

        for (WebElement pickedCountry : suggestedCountries) {

            if (pickedCountry.getText().equalsIgnoreCase(actualCountry)) {

                pickedCountry.click();

                break;

            }

        }

    }

}

