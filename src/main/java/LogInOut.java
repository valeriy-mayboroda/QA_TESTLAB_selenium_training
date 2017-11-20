import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInOut {
    private WebDriver driver;

    private String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private String loginExample = "webinar.test@gmail.com";
    private String passwordExample = "Xcg7299bnSmMuRLp9ITw";

    private By login = By.id("email");
    private By password = By.id("passwd");
    private By loginButton = By.name("submitLogin");
    private By employeeElement = By.id("employee_infos");
    private By logoutButton = By.id("header_logout");

    public LogInOut(WebDriver driver) {this.driver = driver;}

    public void openUrl() {driver.get(url);}
    public void fillLogin() {driver.findElement(login).sendKeys(loginExample);}
    public void fillPassword() {driver.findElement(password).sendKeys(passwordExample);}
    public void clickLogInButton() {driver.findElement(loginButton).click();}
    public void clickEmployeeElement() {driver.findElement(employeeElement).click();}
    public void clickLogoutButton() {driver.findElement(logoutButton).click();}

    public void doLogIn() {
        openUrl();
        fillLogin();
        fillPassword();
        clickLogInButton();
    }
    public void doLogOut() {
        clickEmployeeElement();
        clickLogoutButton();
    }
}
