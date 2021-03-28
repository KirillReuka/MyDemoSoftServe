import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {
    WebDriver driver;

    private By countItems = By.xpath("//span[@class='cabinet-navigation__counter']");
    private By check = By.xpath("//div[@class='goods-tile']//label[1]");
    private By deleteButton = By.xpath("//button[contains(@class, 'js-goods-delete')]");

    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }

    public WishListPage deleteItemFromWishlist(){
        if (!driver.findElement(countItems).isDisplayed()) {
            throw new IllegalStateException("Count of items is not displayed");
        }
        driver.findElement(check).click();
        driver.findElement(deleteButton).click();
        return this;
    }


}
