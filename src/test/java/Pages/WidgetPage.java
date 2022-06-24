package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetPage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement accordian;
    WebElement autoComplete;
    WebElement datePicker;
    WebElement slider;
    WebElement progressBar;
    WebElement tabs;
    WebElement toolTips;
    WebElement menu;
    WebElement selectMenu;



    public WidgetPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
