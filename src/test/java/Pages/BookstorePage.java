package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookstorePage extends BasePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement login;
    WebElement bookstore;
    WebElement profile;
    WebElement bookstoreAPI;

    public BookstorePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
