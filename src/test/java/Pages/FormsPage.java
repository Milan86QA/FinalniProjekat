package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement practiceForm;

    public WebElement getPracticeForm() {
        return driver.findElement(By.className("Practice Form"));
    }

    public FormsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
