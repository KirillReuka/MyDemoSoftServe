import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WishListPageTest extends BaseTest{

    private By heartIcon = By.xpath("//rz-wishlist[@class='header-actions__component']/a[@href='https://rozetka.com.ua/cabinet/wishlist/']");

    @Test
        public void deleteOneItem(){
        HomePage homePage = new HomePage(driver);
        WishListPage wishListPage = new WishListPage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage.login("reuka.kirill@gmail.com", "Testpassword123");
        homePage.search("Apple iPhone 11");
        searchResultPage.addToWishList();
        driver.findElement(heartIcon).click();
        wishListPage.deleteItemFromWishlist();
    }
}
