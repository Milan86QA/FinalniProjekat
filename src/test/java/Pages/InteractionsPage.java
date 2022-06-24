package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsPage extends BasePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement sortable;
    WebElement selectable;
    WebElement resizable;
    WebElement droppable;
    WebElement dragable;
    public InteractionsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
