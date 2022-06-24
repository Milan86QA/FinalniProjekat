package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BasePage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement elementsButton;
    WebElement formsButton;
    WebElement AlertsButton;
    WebElement WidgetButton;
    WebElement interactionsButton;
    WebElement bookStoreApp;

    public Homepage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElementsButton() {
        return driver.findElement(By.className("card-body"));
    }

    public WebElement getFormsButton() {
        return driver.findElement(By.className("card mt-4 top-card"));
    }

    public WebElement getAlertsButton() {
        return driver.findElement(By.className("avatar mx-auto white"));
    }

    public WebElement getWidgetButton() {
        return driver.findElement(By.xpath(""));
    }

    public WebElement getInteractionsButton() {
        return driver.findElement(By.xpath(""));
    }

    public WebElement getBookStoreApp() {
        return driver.findElement(By.xpath(""));
    }
    //-------------------------------------------------------------------------------

    public void clickOnElementsButton(){
        this.getElementsButton().click();
    }
    public void clickOnFormsButton(){
        this.getFormsButton().click();
    }
    public void clickOnAlertsButton(){
        this.getAlertsButton().click();
    }
    public void clickOnWidgetButton(){
        this.getWidgetButton().click();
    }
    public void clickOnInteractionsButton(){
        this.getInteractionsButton().click();
   }
    public void clickOnBookStoreApp(){
        this.getBookStoreApp().click();
   }

}
