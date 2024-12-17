import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Assignment3_2 {
/*
package vegetable.deep05;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AssignmentLoginCheckout {
public static void main(String[] args) {
String[] item = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"}; WebDriver driver = new ChromeDriver(); driver.get("https://rahulshettyacademy.com/loginpagePractise/"); driver.findElement(By.id("username")).sendKeys("rahulshettyacademy"); driver.findElement(By.id("password")).sendKeys("learning"); driver.findElement(By.xpath("//label[@class='customradio'][2]/span[@class='checkmark']")).click(); WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10)); w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));     driver.findElement(By.id("okayBtn")).click(); WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control")); Select dropdown = new Select(staticDropdown); dropdown.selectByValue("consult"); driver.findElement(By.id("terms")).click(); driver.findElement(By.id("signInBtn")).click(); AssignmentLoginCheckout alc = new AssignmentLoginCheckout(); alc.addItem(driver, item, w); driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click(); driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click(); driver.findElement(By.id("country")).sendKeys("India"); w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//a[text() = 'India']"))); driver.findElement(By.cssSelector("//a[text() = 'India']")).click(); driver.findElement(By.id("checkbox2")).click(); driver.findElement(By.cssSelector("input.btn")).click(); } public void addItem(WebDriver driver, String[] item, WebDriverWait w) { List items = Arrays.asList(item); w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title a"))); List allItem = driver.findElements(By.cssSelector("h4.card-title a")); for(int i = 0; i < allItem.size(); i++) { String name = allItem.get(i).getText(); if(items.contains(name)) { driver.findElements(By.cssSelector("button.btn")).get(i).click(); } } } }
 */

    public static void main(String[] args) { // TODO Auto-generated method stub
        String[] item = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[@class='customradio'][2]/span[@class='checkmark']")).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        Assignment3_2 alc = new Assignment3_2();
        alc.addItem(driver, item, w);
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();
        driver.findElement(By.id("country")).sendKeys("India");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//a[text() = 'India']")));
        driver.findElement(By.cssSelector("//a[text() = 'India']")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.cssSelector("input.btn")).click();
    }

    public void addItem(WebDriver driver, String[] item, WebDriverWait w) {
        List items = Arrays.asList(item);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title a")));
        List allItem = driver.findElements(By.cssSelector("h4.card-title a"));
        for (int i = 0; i < allItem.size(); i++) {
            String name = (String) allItem.get(i); // Not working!
            if (items.contains(name)) {
                driver.findElements(By.cssSelector("button.btn")).get(i).click();
            }
        }
    }
}


