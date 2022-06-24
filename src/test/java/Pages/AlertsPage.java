package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement browserWindows;
    WebElement alerts;
    WebElement frames;
    WebElement nestedFrames;
    WebElement modalDialogs;

    public WebElement getBrowserWindows() {
        return browserWindows;
    }

    public WebElement getAlerts() {
        return alerts;
    }

    public WebElement getFrames() {
        return frames;
    }

    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    public WebElement getModalDialogs() {
        return modalDialogs;
    }

    public AlertsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
