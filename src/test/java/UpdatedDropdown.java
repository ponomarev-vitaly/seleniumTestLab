import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // driver.get("https://www.spicejet.com/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Grab all checkboxes on the page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

//        for(int j = 1; j<5; j++){
//            driver.findElement(By.id("hrefIncAdt")).click();
//        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        // System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("The return date calendar is enabled...");
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

    }
}
