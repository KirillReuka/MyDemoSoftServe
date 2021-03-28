import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    private By searchField = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[text()=' Найти ']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage search(String searchQuery){
        driver.findElement(searchField).sendKeys(searchQuery);
        driver.findElement(searchButton).click();
        return new SearchResultPage(driver);
    }
}
