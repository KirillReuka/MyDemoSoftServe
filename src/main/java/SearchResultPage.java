import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    WebDriver driver;

    private By firstHeartProduct = By.xpath("//button[@class='wish-button js-wish-button']");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage addToWishList(){
        driver.findElement(firstHeartProduct).click();
        return this;
    }
}
