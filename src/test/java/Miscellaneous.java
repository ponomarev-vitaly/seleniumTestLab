import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Miscellaneous {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        // driver.manage().deleteCookieNamed("sessionKey");
        // driver.manage().addCookie("abc");
        driver.get("http://google.com");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\vvp\\IdeaProjects\\seleniumTestLab\\src\\screenshot.png");
        FileUtils.copyFile(src, dest);


//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("C:\\Users\\vvp\\IdeaProjects\\seleniumTestLab\\src\\screenshot.png"));
    }
}
