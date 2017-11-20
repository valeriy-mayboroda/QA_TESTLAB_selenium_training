import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickTest {
    private WebDriver driver;
    private By parent = By.className("menu");

    public ClickTest(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDashboard() {
        driver.findElement(parent).findElement(By.id("tab-AdminDashboard")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickOrders() {
        driver.findElement(parent).findElement(By.id("subtab-AdminParentOrders")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickCatalog() {
        driver.findElement(parent).findElement(By.id("subtab-AdminCatalog")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickCustomers() {
        driver.findElement(parent).findElement(By.id("subtab-AdminParentCustomer")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickAdminHelp() {
        driver.findElement(parent).findElement(By.id("subtab-AdminParentCustomerThreads")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickAdminStatistic() {
        driver.findElement(parent).findElement(By.id("subtab-AdminStats")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickModules() {
        driver.findElement(parent).findElement(By.id("subtab-AdminParentModulesSf")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickDesign() {
        driver.findElement(parent).findElement(By.id("subtab-AdminParentThemes")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickSend(){
        driver.findElement(parent).findElement(By.id("subtab-AdminParentShipping")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickPayment() {
        driver.findElement(parent).findElement(By.id("subtab-AdminParentPayment")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickInternational() {
        driver.findElement(parent).findElement(By.id("subtab-AdminInternational")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickShopParameters() {
        driver.findElement(parent).findElement(By.id("subtab-ShopParameters")).findElement(By.tagName("a")).click();
        console();
    }
    public void clickConfigure() {
        driver.findElement(parent).findElement(By.id("subtab-AdminAdvancedParameters")).findElement(By.tagName("a")).click();
        console();
    }

    public void testAll() {
        clickDashboard();
        clickOrders();
        //clickCatalog();
        clickCustomers();
        clickAdminHelp();
        clickAdminStatistic();
        //clickModules();
        clickDesign();
        clickSend();
        clickPayment();
        clickInternational();
        clickShopParameters();
        clickConfigure();
    }

    public void console() {
        String header = driver.findElement(By.id("content")).findElement(By.className("page-title")).getText();
        System.out.println("After click : " + header);
        driver.navigate().refresh();
        String headerRefresh = driver.findElement(By.id("content")).findElement(By.className("page-title")).getText();
        System.out.println("After refresh : " + headerRefresh);
    }
}
