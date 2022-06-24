package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox extends BasePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement fullName;
    WebElement email;
    WebElement currento;
    WebElement permanento;

    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrento() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanento() {
        return driver.findElement(By.id("permanentAddress"));
    }
}
