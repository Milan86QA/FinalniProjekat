package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement button;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadDownload;
    WebElement dynamicProperties;

    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getButton() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenLinksImages() {
        return driver.findElement(By.id("item-6"));
    }

    public WebElement getUploadDownload() {
        return driver.findElement(By.id("item-7"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.id("item-8"));
    }
}
