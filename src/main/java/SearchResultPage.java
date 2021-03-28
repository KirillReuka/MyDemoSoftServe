import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    WebDriver driver;

    private By firstHeartProduct = By.xpath("//button[@class='wish-button js-wish-button']");
    private By searchField = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[text()=' Найти ']");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage addToWishList(){
        driver.findElement(firstHeartProduct).click();
        return this;
    }

    public SearchResultPage search(String searchQuery) {
        driver.findElement(searchField).sendKeys(searchQuery);
        driver.findElement(searchButton).click();
        return new SearchResultPage(driver);
    }
}
