import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By emailInput = By.xpath("//input[@id='auth_email']");
    private By passwordInput = By.xpath("//input[@id='auth_pass']");
    private By signInButton = By.cssSelector(".button--green.auth-modal__submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signInButton).click();
        return new HomePage(driver);
    }
}
