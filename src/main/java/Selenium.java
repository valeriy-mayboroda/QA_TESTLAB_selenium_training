import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Selenium {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Scrypt A
        LogInOut test = new LogInOut(driver);
        test.doLogIn();
        test.doLogOut();
        //Scrypt B
        test.doLogIn();
        ClickTest clickable = new ClickTest(driver);
        clickable.testAll();
        driver.quit();
    }
    public static WebDriver initChromeDriver() {
        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        return new ChromeDriver();
    }
}
